package control;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import entities.IEvent;
import entities.InputKeyEvent;
import entities.InputRotationEvent;
import entities.InputSwipe;
import entities.InputTap;
import entities.InputText;
import gui.InputKeyEventUI;
import gui.InputRotationEventUI;
import gui.InputSwipeUI;
import gui.InputTapUI;
import gui.InputTextUI;


public class MainControl implements IMainControl, Serializable{
	
	private List<IEvent> events;
	private ICommandExecuter commandExecuter;
	private IMainClass mainClass;
	private IPersistenceControl persistenceControl;
	private IDataResolver dataResolver;
	private Thread imagePullingThread;
	
	public MainControl(IMainClass mainClass){
		this.mainClass = mainClass;
		events = new LinkedList<IEvent>();
		dataResolver = (IDataResolver) mainClass.getFactory()
				.getInstanceOf(IDataResolver.class, null/*args*/);
		commandExecuter = (ICommandExecuter) mainClass.getFactory()
				.getInstanceOf(ICommandExecuter.class, null/*args*/);
		commandExecuter.executeCommand("adb shell mkdir "+dataResolver.getDeviceWorkingDirectory());
		persistenceControl = (IPersistenceControl) mainClass.getFactory()
				.getInstanceOf(IPersistenceControl.class, null/*args*/);
		startImageThread();
	}
	
	public List<IEvent> getEvents(){
		return events;
	}
	
	public void addKeyEvent(){
		Object[] args = new Object[1];
		args[0] = 0;
		InputKeyEvent keyEvent = (InputKeyEvent)
				mainClass.getFactory().getInstanceOf(InputKeyEvent.class, args);
		events.add(keyEvent);
		InputKeyEventUI ui = new InputKeyEventUI(keyEvent);
		ui.show();
	}
	
	public void addRotationEvent(){
		Object[] args = new Object[1];
		args[0] = 0;
		InputRotationEvent rotationEvent =  (InputRotationEvent)
				mainClass.getFactory().getInstanceOf(InputRotationEvent.class, args);
		events.add(rotationEvent);
		InputRotationEventUI ui = new InputRotationEventUI(rotationEvent);
		ui.show();
	}
	
	public void addSwipeEvent(){
		Object[] args = new Object[5];
		args[0] = 0;
		args[1] = 0;
		args[2] = 100;
		args[3] = 100;
		args[4] = new Long(1000);
		InputSwipe swipe = (InputSwipe)
				mainClass.getFactory().getInstanceOf(InputSwipe.class, args);
		events.add(swipe);
		InputSwipeUI ui = new InputSwipeUI(swipe);
		ui.show();
	}
	
	public void addTapEvent(){
		Object[] args = new Object[2];
		args[0] = 0;
		args[1] = 0;
		InputTap tap = (InputTap)
				mainClass.getFactory().getInstanceOf(InputTap.class, args);
		events.add(tap);
		InputTapUI ui = new InputTapUI(tap);
		ui.show();
	}
	
	public void addTextEvent(){
		Object[] args = new Object[1];
		args[0] = "";
		InputText text = (InputText)
				mainClass.getFactory().getInstanceOf(InputText.class, args);
		events.add(text);
		InputTextUI ui = new InputTextUI(text);
		ui.show();
	}
	
	public void playEvents(){
		mainClass.getMainUI().lockPlayButton();
		System.out.println("Playing events");
		for(IEvent event : events){
			commandExecuter.executeCommand("adb shell "+event.getCommand());
		}
		System.out.println("End of the events\n");
		mainClass.getMainUI().unlockPlayButton();
	}
	
	public void playEventsFrom(IEvent event){
		mainClass.getMainUI().lockPlayButton();
		System.out.println("Playing events");
		int index = events.indexOf(event);
		for(int i=index;i<events.size();i++){
			commandExecuter.executeCommand("adb shell "+events.get(i).getCommand());
		}
		System.out.println("End of the events\n");
		mainClass.getMainUI().unlockPlayButton();
	}
	
	public void saveEvents(){
		persistenceControl.saveEvents(events);
	}
	
	public void readEvents(){
		List<IEvent> readEvents = persistenceControl.readEvents();
		if(readEvents != null)
			events = readEvents;
	}
	
	public void modifyEvent(IEvent event){
		if(event.getClass().equals(InputKeyEvent.class)){
			InputKeyEventUI ui = new InputKeyEventUI((InputKeyEvent) event);
			ui.show();
		}
		else if(event.getClass().equals(InputRotationEvent.class)){
			InputRotationEventUI ui = new InputRotationEventUI((InputRotationEvent) event);
			ui.show();
		}
		else if(event.getClass().equals(InputSwipe.class)){
			InputSwipeUI ui = new InputSwipeUI((InputSwipe) event);
			ui.show();
		}
		else if(event.getClass().equals(InputTap.class)){
			InputTapUI ui = new InputTapUI((InputTap) event);
			ui.show();
		}
		else if(event.getClass().equals(InputText.class)){
			InputTextUI ui = new InputTextUI((InputText) event);
			ui.show();
		}
	}
	
	public void deleteEvent(IEvent event){
		events.remove(event);
	}
	
	public void moveUp(IEvent event){
		int index = events.indexOf(event);
		if(index>0){//If it's not the first event.
			events.remove(index);
			events.add(index-1, event);
		}
	}
	
	public void moveDown(IEvent event){
		int index = events.indexOf(event);
		if(index<events.size()-1){//If it's not the last event.
			events.remove(index);
			events.add(index+1, event);
		}
	}
	
	private void startImageThread(){
		imagePullingThread = new Thread(new Runnable(){

			@Override
			public void run() {
				while(true){
					try{
						pullImageFromDevice();
						Thread.sleep(1000);
					}
					catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			
		});
		imagePullingThread.start();
	}
	
	private void pullImageFromDevice(){
		//Take the screenshot
		String command = "adb shell screencap "+dataResolver.getDeviceImageFileLocation();
		commandExecuter.executeCommand(command);
		
		//Pull the image to the working directory
		command = "adb pull "+dataResolver.getDeviceImageFileLocation()+" "+dataResolver.getLocalImageFileLocation();
		commandExecuter.executeCommand(command);
	}
}

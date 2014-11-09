package control;

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


public class MainControl implements IMainControl{
	
	private List<IEvent> events;
	private IMainClass mainClass;
	
	public MainControl(IMainClass mainClass){
		this.mainClass = mainClass;
		events = new LinkedList<IEvent>();
	}
	
	public List<IEvent> getEvents(){
		return events;
	}
	
	public void addKeyEvent(){
		InputKeyEvent keyEvent = new InputKeyEvent(0);
		events.add(keyEvent);
		InputKeyEventUI ui = new InputKeyEventUI(keyEvent);
		ui.show();
	}
	
	public void addRotationEvent(){
		InputRotationEvent rotationEvent = new InputRotationEvent(0);
		events.add(rotationEvent);
		InputRotationEventUI ui = new InputRotationEventUI(rotationEvent);
		ui.show();
	}
	
	public void addSwipeEvent(){
		InputSwipe swipe = new InputSwipe(0, 0, 100, 100, 1000);
		events.add(swipe);
		InputSwipeUI ui = new InputSwipeUI(swipe);
		ui.show();
	}
	
	public void addTapEvent(){
		InputTap tap = new InputTap(0, 0);
		events.add(tap);
		InputTapUI ui = new InputTapUI(tap);
		ui.show();
	}
	
	public void addTextEvent(){
		InputText text = new InputText("");
		events.add(text);
		InputTextUI ui = new InputTextUI(text);
		ui.show();
	}
	
}

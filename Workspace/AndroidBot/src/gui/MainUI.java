package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import control.IDataResolver;
import control.IMainClass;
import entities.IEvent;

public class MainUI extends javax.swing.JFrame implements IMainUI, ActionListener{
	
	// Variables declaration - do not modify
	private JButton playEventsButton;
	private JButton playEventsFromSelectedButton;
	private JButton saveEventsButton;
	private JButton readEventsButton;
    private JButton addEventButton;
    private JPanel buttonsPanel;
    private JButton deleteEventButton;
    private JPanel eventListPanel;
    private JComboBox<String> eventTypesComboBox;
    private JScrollPane scrollEvents;
    private JButton modifyEventButton;
    private JButton moveDownButton;
    private JButton moveUpButton;
	private ImagePanel imagePanel;
	
	private EventLabel selectedEventLabel;
	
	private IMainClass mainClass;
	private IDataResolver dataResolver;
	
    /**
     * Creates new form MainUI
     */
    public MainUI(IMainClass mainClass) {
    	this.mainClass = mainClass;
    	dataResolver = (IDataResolver) mainClass.getFactory()
				.getInstanceOf(IDataResolver.class, null/*args*/);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	
        imagePanel = new ImagePanel(dataResolver.getLocalImageFileLocation(), this);
        buttonsPanel = new javax.swing.JPanel();
        playEventsButton = new javax.swing.JButton();
        playEventsFromSelectedButton = new javax.swing.JButton();
        saveEventsButton = new javax.swing.JButton();
        readEventsButton = new javax.swing.JButton();
        addEventButton = new javax.swing.JButton();
        deleteEventButton = new javax.swing.JButton();
        modifyEventButton = new javax.swing.JButton();
        moveDownButton = new javax.swing.JButton();
        eventTypesComboBox = new javax.swing.JComboBox<String>();
        moveUpButton = new javax.swing.JButton();
        scrollEvents = new javax.swing.JScrollPane();
        eventListPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        playEventsButton.setText("Play events");
        
        playEventsFromSelectedButton.setText("From selected");
        
        saveEventsButton.setText("Save events");
        
        readEventsButton.setText("Read events");
        
        addEventButton.setText("Add event");

        deleteEventButton.setText("Delete event");

        modifyEventButton.setText("Modify event");

        moveDownButton.setText("Move down");

        eventTypesComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Key", "Rotation", "Swipe", "Tap", "Text" }));

        moveUpButton.setText("Move up");
        
        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(playEventsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveEventsButton))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(playEventsFromSelectedButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(readEventsButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                        .addComponent(deleteEventButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifyEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(addEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventTypesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(moveDownButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moveUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playEventsButton)
                    .addComponent(saveEventsButton)
                    .addComponent(addEventButton)
                    .addComponent(eventTypesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moveUpButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(readEventsButton)
                        .addComponent(deleteEventButton)
                        .addComponent(modifyEventButton)
                        .addComponent(playEventsFromSelectedButton))
                    .addComponent(moveDownButton))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout eventListPanelLayout = new javax.swing.GroupLayout(eventListPanel);
        eventListPanel.setLayout(eventListPanelLayout);
        eventListPanelLayout.setHorizontalGroup(
            eventListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        eventListPanelLayout.setVerticalGroup(
            eventListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        eventListPanel.setLayout(new BoxLayout(eventListPanel, BoxLayout.PAGE_AXIS));
        
        scrollEvents.setViewportView(eventListPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        addEventButton.setToolTipText("Adds an event of the selected type");
        playEventsButton.setToolTipText("Runs the events on the connected device (must have adb setup on the system)");
        playEventsFromSelectedButton.setToolTipText("Runs the commands starting from the selected command downwards");
        saveEventsButton.setToolTipText("Saves the current script of events into a file");
        readEventsButton.setToolTipText("Reads a script from a file");
        modifyEventButton.setToolTipText("Modify the currently selected event");
        deleteEventButton.setToolTipText("Deletes the currently selected event");
        moveUpButton.setToolTipText("Moves the currently selected event upwards one space");
        moveDownButton.setToolTipText("Moves the currently selected event downwards one space");
        
        addEventButton.addActionListener(this);
        playEventsButton.addActionListener(this);
        playEventsFromSelectedButton.addActionListener(this);
        saveEventsButton.addActionListener(this);
        readEventsButton.addActionListener(this);
        modifyEventButton.addActionListener(this);
        deleteEventButton.addActionListener(this);
        moveDownButton.addActionListener(this);
        moveUpButton.addActionListener(this);
        
        pack();
        setSize(1020, 630);
    }
    
    public IMainClass getMainClass(){
    	return mainClass;
    }
    
    public void lockPlayButton(){
    	playEventsButton.setEnabled(false);
    	playEventsFromSelectedButton.setEnabled(false);
    }
    
    public void unlockPlayButton(){
    	playEventsButton.setEnabled(true);
    	playEventsFromSelectedButton.setEnabled(true);
    }
    
    public void setSelectedEventLabel(EventLabel eventLabel){
    	if(selectedEventLabel!=null)
    		selectedEventLabel.deselect();
    	selectedEventLabel = eventLabel;
    }
    
    public void updateEventList(){
    	eventListPanel.removeAll();
    	List<IEvent> eventList = mainClass.getMainControl().getEvents();
    	for(IEvent event : eventList){
    		boolean isSelected = false;
    		if(selectedEventLabel!=null)
    			event.equals(selectedEventLabel.getEvent());
    		
    		EventLabel label = new EventLabel(event, this, isSelected);
    		eventListPanel.add(label);
    	}
    	eventListPanel.setVisible(false);
    	eventListPanel.setVisible(true);
    }
    
    public void repaintScreenshot(){
    	imagePanel.setVisible(false);
    	imagePanel.setVisible(true);
    }

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(addEventButton)){
			//{ "Key", "Rotation", "Swipe", "Tap", "Text" }
			int opt = eventTypesComboBox.getSelectedIndex();
			if(opt==0)
				mainClass.getMainControl().addKeyEvent();
			else if(opt==1)
				mainClass.getMainControl().addRotationEvent();
			else if(opt==2)
				mainClass.getMainControl().addSwipeEvent();
			else if(opt==3)
				mainClass.getMainControl().addTapEvent();
			else if(opt==4)
				mainClass.getMainControl().addTextEvent();
		}
		else if(e.getSource().equals(modifyEventButton)){
			if(selectedEventLabel != null)
				mainClass.getMainControl().modifyEvent(selectedEventLabel.getEvent());
		}
		else if(e.getSource().equals(deleteEventButton)){
			if(selectedEventLabel!=null){
				mainClass.getMainControl().deleteEvent(selectedEventLabel.getEvent());
				selectedEventLabel = null;
			}
		}
		else if(e.getSource().equals(moveDownButton)){
			if(selectedEventLabel!=null)
				mainClass.getMainControl().moveDown(selectedEventLabel.getEvent());
		}
		else if(e.getSource().equals(moveUpButton)){
			if(selectedEventLabel!=null)
				mainClass.getMainControl().moveUp(selectedEventLabel.getEvent());
		}
		else if(e.getSource().equals(playEventsButton)){
			mainClass.getMainControl().playEvents();
		}
		else if(e.getSource().equals(playEventsFromSelectedButton)){
			if(selectedEventLabel!=null)
				mainClass.getMainControl().playEventsFrom(selectedEventLabel.getEvent());
		}
		else if(e.getSource().equals(saveEventsButton)){
			mainClass.getMainControl().saveEvents();
		}
		else if(e.getSource().equals(readEventsButton)){
			mainClass.getMainControl().readEvents();
		}
		updateEventList();
	}
}

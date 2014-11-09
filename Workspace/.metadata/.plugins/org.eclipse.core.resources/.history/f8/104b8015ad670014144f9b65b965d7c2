package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import control.IDataResolver;
import control.IMainClass;

public class MainUI extends javax.swing.JFrame implements IMainUI, ActionListener{
	
	// Variables declaration - do not modify                     
    private JButton addEventButton;
    private JPanel buttonsPanel;
    private JButton deleteEventButton;
    private JPanel eventListPanel;
    private JComboBox<String> eventTypesComboBox;
    private JScrollPane jScrollPane1;
    private JButton modifyEventButton;
    private JButton moveDownButton;
    private JButton moveUpButton;
	private ImagePanel imagePanel;
	
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
    	
        imagePanel = new ImagePanel(dataResolver.getLocalImageFileLocation());
        buttonsPanel = new javax.swing.JPanel();
        addEventButton = new javax.swing.JButton();
        deleteEventButton = new javax.swing.JButton();
        modifyEventButton = new javax.swing.JButton();
        moveDownButton = new javax.swing.JButton();
        eventTypesComboBox = new javax.swing.JComboBox<String>();
        moveUpButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
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
                .addGap(27, 27, 27)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(addEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eventTypesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(deleteEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifyEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moveDownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moveUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEventButton)
                    .addComponent(eventTypesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moveUpButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteEventButton)
                    .addComponent(modifyEventButton)
                    .addComponent(moveDownButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout eventListPanelLayout = new javax.swing.GroupLayout(eventListPanel);
        eventListPanel.setLayout(eventListPanelLayout);
        eventListPanelLayout.setHorizontalGroup(
            eventListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        eventListPanelLayout.setVerticalGroup(
            eventListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(eventListPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        addEventButton.addActionListener(this);
        
        pack();
        setSize(950, 600);
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
		
	}
}

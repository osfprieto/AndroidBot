package gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import entities.InputKeyEvent;

public class InputKeyEventUI implements IEventUI{

	private InputKeyEvent event;
	private JPanel panel;
	private JSpinner keyCodeSpinner;
	
	public InputKeyEventUI(InputKeyEvent event){
		if(event!=null)
			this.event = event;
		else
			this.event = new InputKeyEvent(0);
		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		panel.add(new JLabel("Key code"));
		keyCodeSpinner = new JSpinner();
		panel.add(keyCodeSpinner);
	}
	
	public InputKeyEvent getEvent(){
		return event;
	}
	
	public void show(){
		keyCodeSpinner.setValue(event.getKeyCodeNumber());
		JOptionPane.showMessageDialog(null, panel, "Key Event", JOptionPane.QUESTION_MESSAGE);
		event.setKeyCodeNumber((Integer)keyCodeSpinner.getValue());
	}
	
}

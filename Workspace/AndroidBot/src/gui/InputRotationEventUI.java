package gui;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import entities.InputRotationEvent;

public class InputRotationEventUI {

	private InputRotationEvent event;
	private JPanel panel;
	private JComboBox<String> combo;
	
	//0->0� 1->90� 2->180� 3->270�	
	public InputRotationEventUI(InputRotationEvent event){
		if(event!=null)
			this.event = event;
		else
			this.event = new InputRotationEvent(0);
		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		panel.add(new JLabel("Rotation"));
		String options[] = {"0 - 0�", "1 - 90�", "2 - 180�", "3 - 270�"};
		combo = new JComboBox<String>(options);
		panel.add(combo);
	}
	
	public InputRotationEvent getEvent(){
		return event;
	}
	
	public void show(){
		JOptionPane.showMessageDialog(null, panel);
		event.setRotationCode(combo.getSelectedIndex());
	}
	
}

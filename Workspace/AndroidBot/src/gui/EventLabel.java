package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import entities.IEvent;

public class EventLabel extends JLabel implements MouseListener{

	public static final Color HOVER_COLOR = new Color(220, 220, 220);
	public static final Color BG_COLOR = new Color(238, 238, 238);
	public static final Color SELECTED_COLOR = new Color(255, 255, 255);
	
	private IEvent event;
	private IMainUI mainUI;
	private boolean isSelected;
	
	public EventLabel(IEvent event, IMainUI mainUI){
		this.event = event;
		this.mainUI = mainUI;
		isSelected = false;
		setOpaque(true);
		setBackground(BG_COLOR);
		setText(event.getCommand());
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		mainUI.setSelectedEventLabel(this);
		isSelected = true;
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		setBackground(HOVER_COLOR);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		if(isSelected)
			setBackground(SELECTED_COLOR);
		else
			setBackground(BG_COLOR);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public IEvent getEvent(){
		return event;
	}
	
	public void deselect(){
		isSelected = false;
	}
}

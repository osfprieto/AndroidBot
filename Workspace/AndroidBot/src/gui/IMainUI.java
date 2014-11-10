package gui;

import control.IMainClass;

/**
 * Interface to make the user interface modular and changeable. The methods used from a control class
 * should appear here.*/
public interface IMainUI {
	public void setVisible(boolean visible);
	public void lockPlayButton();
	public void unlockPlayButton();
	public void setSelectedEventLabel(EventLabel eventLabel);
	public void repaintScreenshot();
	public void updateEventList();
	public IMainClass getMainClass();
}

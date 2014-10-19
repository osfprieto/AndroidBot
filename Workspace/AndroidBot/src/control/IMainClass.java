package control;

import gui.IMainUI;

/**
 * This interfaces is the main interface of the program. Provides the MainControl, Factory and UI classes*/
public interface IMainClass {
	public IFactory getFactory();
	public IMainControl getMainControl();
	public IMainUI getMainUI();
}

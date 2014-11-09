package control;

/**
 * This interfaces controls all the operations that the program does before interacting with the user.*/
public interface IMainControl {

	public void addKeyEvent();
	public void addRotationEvent();
	public void addSwipeEvent();
	public void addTapEvent();
	public void addTextEvent();
	public void playEvents();
	
}

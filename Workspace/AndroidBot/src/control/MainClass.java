package control;
import gui.IMainUI;
import gui.MainUI;

/**
 * Start of the program. Instantiates the UI, the Factory and the  to be used on the entire program.
 * Not unit testable because it's dependable on other classes.
 * */
public class MainClass implements IMainClass{
	private IFactory factory;
	private IMainUI mainUI;
	private IMainControl mainControl;
	
	public static void main(String[] args){
		MainClass main = new MainClass();
		main.getMainUI().setVisible(true);
	}
	
	public MainClass(){
		factory = new Factory();
		mainUI = new MainUI(this);
		mainControl = new MainControl(this);
	}
	
	public IFactory getFactory(){
		return factory;
	}
	
	public IMainControl getMainControl(){
		return mainControl;
	}
	
	public IMainUI getMainUI(){
		return mainUI;
	}
	
}

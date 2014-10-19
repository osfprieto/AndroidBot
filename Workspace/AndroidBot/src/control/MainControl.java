package control;

/**
 * Start of the program. Instantiates the UI, the Factory and the  to be used on the entire program.
 * Not unit testable because it's dependable on other classes.
 * */
public class MainControl implements IMainControl{
	
	private IMainClass mainClass;
	
	public MainControl(IMainClass mainClass){
		this.mainClass = mainClass;
	}
}

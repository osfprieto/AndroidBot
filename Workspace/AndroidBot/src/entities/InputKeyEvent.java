package entities;

import java.io.Serializable;

/**
 * This event manages the Input keyevent event for the Android Shell.
 * We can use this for the spaces on text*/
public class InputKeyEvent implements IEvent, Serializable{

	private int keyCodeNumber;
	
	public InputKeyEvent(int keyCodeNumber){
		this.keyCodeNumber = keyCodeNumber;
	}
	
	@Override
	public String getCommand() {
		return "input keyevent "+keyCodeNumber;
	}

	public int getKeyCodeNumber(){
		return keyCodeNumber;
	}
	
	public void setKeyCodeNumber(int keyCodeNumber){
		this.keyCodeNumber = keyCodeNumber;
	}
	
}


package entities;

import java.io.Serializable;

/**
 * This event manages the Input text event for the Android Shell, one word per event*/
public class InputText implements IEvent, Serializable{

	private String text;
	
	/**
	 * @param text Text to be written. One word at a time*/
	public InputText(String text){
		this.text = text.split(" ")[0].trim();
	}
	
	@Override
	public String getCommand() {
		return "input text "+text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}

package entities;
/**
* This event manages the Input rotationevent event for the Android Shell*/
public class InputRotationEvent implements IEvent{

	private int rotationCode;
	
	/**
	 * @param rotationCode 0->0° 1->90° 2->180° 3->270°*/
	public InputRotationEvent(int rotationCode){
		this.rotationCode = rotationCode;
	}
	
	@Override
	public String getCommand() {
		return "input rotationevent "+rotationCode;
	}

}

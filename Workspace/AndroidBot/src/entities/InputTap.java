package entities;

/**
 * Implementation of the IEvent interface to handle Tap events for the Input
 * program of the Android Shell*/
public class InputTap implements IEvent{
	private int x;
	private int y;
	
	/**
	 * @param x x coordinate of the point on the screen where to perform the tap event
	 * @param y y coordinate of the point on the screen where to perform the tap event*/
	public InputTap(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String getCommand() {
		return "input tap "+x+" "+y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
}

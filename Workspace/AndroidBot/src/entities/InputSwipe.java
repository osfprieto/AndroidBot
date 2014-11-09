package entities;

/**
* This event manages the Input swipe event for the Android Shell,
* This can be used to throw a longclick*/
public class InputSwipe implements IEvent{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private long millis;
	
	/**
	 * @param x1 x coordinate of the starting point
	 * @param y1 y coordinate of the starting point
	 * @param x2 x coordinate of the ending point
	 * @param y2 y coordinate of the ending point
	 * @param millis time the swipe event will take. If set to 0 or less, the parameter won't be passed to the shell*/
	public InputSwipe(int x1, int y1, int x2, int y2, long millis){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.millis = millis;
	}

	@Override
	public String getCommand() {
		return "input swipe "+x1+" "+y1+" "+x2+" "+y2+(millis>0?" "+millis:"");
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public long getMillis() {
		return millis;
	}

	public void setMillis(long millis) {
		this.millis = millis;
	}
	
	
	
}

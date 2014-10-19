package tests.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.InputSwipe;


public class InputSwipeTest {

	@Test
	public void getCommand_100100To200200millis300_correctlyBuilt() {
		//Setup
		InputSwipe tester = new InputSwipe(100, 100, 200, 200, 300);
		
		//Operation
		String command = tester.getCommand();
		
		//Assertion
		assertTrue("The command was not built correctly: "+command,
				command.equals("input swipe 100 100 200 200 300"));
	}

}

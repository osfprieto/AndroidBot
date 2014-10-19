package tests.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.InputKeyEvent;

public class InputKeyEventTest {

	@Test
	public void getCommand_32_correctlyBuilt() {
		//Setup
		InputKeyEvent tester = new InputKeyEvent(32);
		
		//Operation
		String command = tester.getCommand();
		
		//Assertion
		assertTrue("The command was not built correctly: "+command, command.equals("input keyevent 32"));
	}

}

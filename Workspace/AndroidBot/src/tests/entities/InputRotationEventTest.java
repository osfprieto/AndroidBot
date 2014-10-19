package tests.entities;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entities.InputRotationEvent;

public class InputRotationEventTest {

	@Test
	public void getCommand_0_correctlyBuilt() {
		//Setup
		InputRotationEvent tester = new InputRotationEvent(0);
		
		//Operation
		String command = tester.getCommand();
		
		//Assertion
		assertTrue("The command was not built correctly: "+command, command.equals("input rotationevent 0"));
	}

}

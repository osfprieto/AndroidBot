package tests.entities;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entities.InputTap;


public class InputTapTest {

	@Test
	public void getCommand_100100_correctlyBuilt() {
		//Setup
		InputTap tester = new InputTap(100, 100);
		
		//Operation
		String command = tester.getCommand();
		
		//Assertion
		assertTrue("The command was not built correctly: "+command, command.equals("input tap 100 100"));
	}

}

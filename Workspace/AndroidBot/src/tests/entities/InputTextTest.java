package tests.entities;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entities.InputText;

public class InputTextTest {

	@Test
	public void getCommand_hello_correctlyBuilt() {
		//Setup
		InputText tester = new InputText("hello");
		
		//Operation
		String command = tester.getCommand();
		
		//Assertion
		assertTrue("The command was not built correctly: "+command, command.equals("input text hello"));
	}
	
	@Test
	public void getCommand_helloWorld_correctlyBuilt() {
		//Setup
		InputText tester = new InputText("hello world");
		
		//Operation
		String command = tester.getCommand();
		
		//Assertion
		assertTrue("The command was not built correctly: "+command, command.equals("input text hello"));
	}

}

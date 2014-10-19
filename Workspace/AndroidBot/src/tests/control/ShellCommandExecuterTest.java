package tests.control;

import static org.junit.Assert.*;
import org.junit.Test;
import control.ShellCommandExecuter;

public class ShellCommandExecuterTest {

	/*
	 * Test method naming convention
	 * <Method to test>_<State of test>_<Expected behavior>
	 * */
	
	@Test
	public void executeCommand_echoHello_hello() {
		//Setup
		ShellCommandExecuter tester = new ShellCommandExecuter();
		
		//Operation
		String output = tester.executeCommand("echo hello");
		
		//Assertion
		assertTrue("The output was not the same: "+output, output.equals("hello\n"));
	}

}

package control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Implementation of the ICommandExecuter interface to execute
 * commands on the shell the OS.
 * */
public class ShellCommandExecuter implements ICommandExecuter{

	@Override
	public String executeCommand(String command) {
		StringBuilder output = new StringBuilder();
		 
		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader =
					new BufferedReader(new InputStreamReader(p.getInputStream()));
 
                        String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}
 
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		return output.toString();
	}

}

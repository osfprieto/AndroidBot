package control;

/**
 * The ICommandExecuter interface interacts with external software through commands.
 * */
public interface ICommandExecuter {
	/**
	 * The executeCommand method executes a given command and returns the output given to the command.
	 * @param command A String object with the command to be executed
	 * @return Command output
	 * */
	public String executeCommand(String command);
}

package entities;

/**
 * The description for the events related to the scripts to be executed by
 * an ICommandExecuter implementation
 * */
public interface IEvent {
	/**
	 * Builds the String command to be executed by an ICommandExecuter implementation
	 * @return Command for the ICommandExecuter*/
	public String getCommand();
}

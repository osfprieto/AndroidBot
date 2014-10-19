package control;

/**
 * This interface resolves the information the program uses to operate such as file locations
 * and OS specific commands*/
public interface IDataResolver {
	public String getLocalImageFileLocation();
	public String getDeviceImageFileLocation();
	public String getLocalWorkingDirectory();
	public String getDeviceWorkingDirectory();
	public String getImageFileName();
}

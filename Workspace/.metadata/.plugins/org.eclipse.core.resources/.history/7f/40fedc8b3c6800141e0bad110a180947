package control;

import java.io.File;
import java.nio.file.Paths;

public class DataResolver implements IDataResolver{

	private String localWorkingDirectory;
	private String deviceWorkingDirectory;
	private String localImageFileLocation;
	private String deviceImageFileLocation;
	private String imageFileName;
	
	public DataResolver(){
		resolveData();
	}
	
	private void resolveData(){
		imageFileName = "AndroidBot.png";
		localWorkingDirectory = Paths.get("").toAbsolutePath().toString();
		deviceWorkingDirectory = "/sdcard/screenshots";
		localImageFileLocation = localWorkingDirectory+File.separator+imageFileName;
		deviceImageFileLocation = deviceWorkingDirectory+File.separator+imageFileName;
	}
	
	@Override
	public String getLocalImageFileLocation() {
		return localImageFileLocation;
	}

	@Override
	public String getLocalWorkingDirectory() {
		return localWorkingDirectory;
	}
	
	@Override
	public String getDeviceImageFileLocation() {
		return deviceImageFileLocation;
	}

	@Override
	public String getDeviceWorkingDirectory() {
		return deviceWorkingDirectory;
	}

	@Override
	public String getImageFileName() {
		return imageFileName;
	}

}

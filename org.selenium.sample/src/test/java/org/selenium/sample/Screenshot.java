package org.selenium.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends FailedScreenshots{
   
	
		
	public static void TS(String name) throws IOException {
		
		File shot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shot, new File("C:\\Users\\z0044j3w\\eclipse-workspace\\org.selenium.sample\\Screenshots\\"+name+".jpg"));

	}

}

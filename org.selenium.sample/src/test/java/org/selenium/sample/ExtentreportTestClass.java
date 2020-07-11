package org.selenium.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;





public class ExtentreportTestClass   {
	
	static ExtentTest test;
	static ExtentReports report;
	static WebDriver dr;
	
	
	@BeforeClass
	public void set() {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\z0044j3w\\Downloads\\chromedriver.exe");
     report=new ExtentReports("./Reports/first.html");
     test = report.startTest("ExtentDemo");
		
	}
	
	@Test
	public void test1() {
		test.log(LogStatus.INFO, "Launching Chrome driver");
		dr = new ChromeDriver();
		test.log(LogStatus.INFO, "Launch URL");
		dr.get("https://www.softwaretestinghelp.com/extent-reports-selenium-webdriver/#:~:text=Extent%20Reports%20is%20a%20customizable,Selenium%20WebDrive%20with%20example%20codes.");
		if(dr.getTitle().equalsIgnoreCase("Software")) {
			test.log(LogStatus.PASS, "Actual=Expected Title");}
		}
//		else {
//			test.log(LogStatus.FAIL,test.addScreenCapture(Screenshot.TS("screen1")) ,"Actual!=Expected");
//			
//		
//		
//	}
	
	@AfterClass
	public void teardown() {
		dr.close();
		report.endTest(test);
		report.flush();
	}

}

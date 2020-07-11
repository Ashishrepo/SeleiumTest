package Testc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelbrwser {
	
	WebDriver d=null;
	@BeforeClass
	@Parameters("browser")
	public void setup(@Optional("chrome") String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\z0044j3w\\Downloads\\chromedriver.exe");
			 d= new ChromeDriver();
			 
		}
		
		else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\z0044j3w\\Downloads\\Drivers\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");
			d= new ChromeDriver();
		}
		
	}
	
	
	
	@Test
	public void link() {
		d.get("https://www.selenium.dev/downloads/");
	}
	
	
	@AfterClass
	public void teardown() {
		d.quit();
	}

}

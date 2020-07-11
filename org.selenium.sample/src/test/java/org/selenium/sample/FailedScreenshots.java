	package org.selenium.sample;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


@Listeners(ListnerClass.class)
public class FailedScreenshots {
	
public static WebDriver d;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z0044j3w\\Downloads\\chromedriver.exe");
		
	}

	@Test
	public void Test1() {
		
		d= new ChromeDriver();
		d.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.7");
		Assert.assertEquals(true, false);
	}

	@AfterClass
	public void afterClass() {
		d.quit();
	}

}

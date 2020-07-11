package org.selenium.sample;

import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LinkTest {

	public WebDriver d;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z0044j3w\\Downloads\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		d.get("https://www.toolsqa.com/selenium-webdriver/find-all-the-links/");
		
	}
	
	@Test
	public void Test1() {
		
		
		// Clicking on Sub-Sub-items
		
		Actions ac = new Actions(d);
		WebElement m= d.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a/span/span"));
		 WebElement target = m.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span"));
		 WebElement tg = target.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/ul/li[1]/a/span/span"));
		 
		ac.moveToElement(m).build().perform();
		target.click();
		tg.click();

		
		
		
	}
	
	@Test
	public void Test2() {
		
		System.out.println("INside Test2");
		
	}

}

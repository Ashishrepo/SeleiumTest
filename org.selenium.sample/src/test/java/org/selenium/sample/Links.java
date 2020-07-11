package org.selenium.sample;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Links {


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
	public void Test1() throws InterruptedException {


		
       //Mover Hover to All the elements
		Actions ac= new Actions(d);
		List<WebElement> links = d.findElements(By.xpath("//ul[@id=\"primary-menu\"]/li/a/span/span"));
		for(int i=1;i<=links.size();i++) {
			ac.moveToElement(d.findElement(By.xpath("//ul[@id=\"primary-menu\"]/li["+i+"]/a/span/span"))).build().perform();
			Thread.sleep(2000);

		}
		
		// Actual values
		
		List<String> actual= new ArrayList<String>();
		for(int i=0;i<links.size();i++) {
			actual.add(links.get(i).getText());

		}
		

    // Expected Values
		
		String expectedvalues="HOME;TUTORIAL;SELENIUM TRAINING;VIDEOS;BLOGS;DEMO SITE;ABOUT";
		System.out.println("Expected Values");
		String[] vlues = expectedvalues.split(";");
		for(String ev:vlues) {
			if(actual.contains(ev)) {
				System.out.println("[Expected]:Link "+ev+" should be present.[Actual]:Lnk "+ev+" is present");
			}else {
				System.out.println("[Expected]:Link "+ev+" should be present.[Actual]:Lnk "+ev+" is not present");
			}
		}


		// Specific Sub-items list
//		ac.moveToElement(d.findElement(By.xpath("//ul[@id="primary-menu"]/li[2]/a/span/span"))).build().perform();		
//		List<WebElement> subitems = d.findElements(By.xpath("//ul[@id=\"primary-menu\"]/li[2]/ul/li"));	
//		System.out.println(" *****Sub- elements *****");
//		for(int h=0;h<subitems.size();h++) {
//
//			System.out.println(subitems.get(h).getText());
//		}
		
		

	}
}

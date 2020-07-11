package org.selenium.sample;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;



public class Irctc {

	public WebDriver d;

	@BeforeClass
	public void beforeClass() {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z0044j3w\\Downloads\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



	}
	@Test
	public void TestLoginPage() throws InterruptedException {

		d.get("https://www.irctc.co.in/");
		WebElement bt= d.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button"));
		if (bt.isDisplayed()) {
			bt.click();
			
		}
		
		d.findElement(By.xpath("//*[@id='destination']/descendant::input")).sendKeys("Jabalpur");
		
		
		d.findElement(By.xpath("//p-autocomplete[@id='destination']/parent::div/preceding-sibling::div[1]/descendant::input")).sendKeys("Bangalore");
		
		List<WebElement> lst = d.findElements(By.xpath("//p-dropdown[@id='journeyClass']/descendant::div[@class='ui-dropdown-items-wrapper']/ul/li/span"));
		System.out.println(lst.size());
		
		
 
	}


}

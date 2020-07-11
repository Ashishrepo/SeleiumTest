package INnterview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataValues {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z0044j3w\\Downloads\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		d.get("https://www.moneycontrol.com/");
		d.manage().deleteAllCookies();

		WebElement heading= d.findElement(By.linkText("Global Markets"));

		if(heading.isDisplayed()) {

			System.out.println(heading.getText());

		}
		System.out.println();

		// Coloums
		List<WebElement> coloums = d.findElements(By.xpath("//div[@class='MT15']/table/thead/tr/th"));
		for(int i=0;i<coloums.size();i++) {
			System.out.print(coloums.get(i).getText()+"  ");
		}
		System.out.println();

		//Rows

		List<WebElement> rows = d.findElements(By.xpath("//div[@class='MT15']/table/tbody/tr"));
		for(int i=1;i<=rows.size();i++) {
            
			List<WebElement> data= d.findElements(By.xpath("//div[@class='MT15']/table/tbody/tr["+i+"]/td"));	
			for(int j=0;j<data.size();j++) {

				System.out.print(data.get(j).getText()+" ");
				
			}
			System.out.println();

		}


	}

}


/*
 Output
 
 Global Markets

Indices  Price  Change  % Chg  
DAX Jul 9 12639.96 145.15 1.16 
FTSE Jul 9 6115.91 -40.25 -0.65 
CAC Jul 9 4979.35 -1.78 -0.04 
*/

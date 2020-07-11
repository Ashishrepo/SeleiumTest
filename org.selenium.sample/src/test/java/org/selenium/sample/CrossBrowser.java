package org.selenium.sample;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

public class CrossBrowser {
  
  

  @Test
  @Parameters({"browser"})
  public void beforeClass(String browser) {
	  System.out.println(browser);
	  
	  
  }

  @AfterClass
  public void afterClass() {
  }

}

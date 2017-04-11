package com.rainivan.autoSelenium.autoFramework;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

public class SmokeTest {
	private WebDriver driver;
	
	@BeforeTest
	public void testInitial(){
		driver = new FirefoxDriver();
	}
	
	@AfterTest
	public void testEnd(){
		driver.quit();
	}
	
	@Test
	public void smokeTest_HomePage_Findlink_WanWang() throws Exception
	{

		driver.get("http://www.rainivan.com");
		Thread.sleep(15);
		WebElement LinkElement_Ww = driver.findElement(By.linkText("WanWang"));
		boolean LinkElement_Ww_Exist=LinkElement_Ww.isDisplayed();
		Assert.assertTrue(LinkElement_Ww_Exist);
		
	}
	
	@Test
	public void smokeTest_HomePage_FindLink_ToolsQA()
	{
		
	}
	
	
	/*
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("here you are");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
     // new Object[] { 2, "b" },
    };
 }*/
}

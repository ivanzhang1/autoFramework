package businessTestCases;

import org.testng.annotations.Test;
import businessLibaray.commonFunc.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

public class SmokeTest extends SeleniumBase{
//	private WebDriver driver;
//	
//	@BeforeTest
//	public void testInitial(){
//		//driver = new FirefoxDriver();
//	}
//	
//	@AfterTest
//	public void testEnd(){
//		//driver.quit();
//	}
	
	
	@Test
	public void smokeTest_HomePage_Findlink_WanWang() throws MalformedURLException
	{
		//WebDriver driver=RemoteDriver();
		WebDriver driver=driver("FF");
		driver.get("http://www.rainivan.com");
		WebElement LinkElement_Ww = driver.findElement(By.linkText("WanWang"));
		boolean LinkElement_Ww_Exist=LinkElement_Ww.isDisplayed();
		Assert.assertTrue(LinkElement_Ww_Exist);
		driver.quit();
		long id = Thread.currentThread().getId();
        System.out.println("I'm WanWang function in smoketest class. Thread id is: " + id);
	}
	
//	@Test
//	public void smokeTest_HomePage_Findlink_cnBlogs() throws MalformedURLException
//	{
//		WebDriver driver=RemoteDriver();
//		driver.get("http://www.rainivan.com");
//		WebElement LinkElement_Ww = driver.findElement(By.linkText("cnBlogs"));
//		boolean LinkElement_Ww_Exist=LinkElement_Ww.isDisplayed();
//		Assert.assertTrue(LinkElement_Ww_Exist);
//		driver.quit();
//		long id = Thread.currentThread().getId();
//        System.out.println("I'm cnBlogs function in smoketest class. Thread id is: " + id);
//	}
	
	//@Test
//	public void smokeTest_ToolsQA_Form() throws Exception
//	{
//		driver.get("http://toolsqa.com/automation-practice-form/");
//		//input the first name and last name to the fields.
//		driver.findElement(By.name("firstname")).clear();
//		driver.findElement(By.name("firstname")).sendKeys("ivantest");
//		driver.findElement(By.name("lastname")).clear();
//		driver.findElement(By.name("lastname")).sendKeys("zhang");
//		//radio button
//		driver.findElement(By.id("sex-0")).click();
//		driver.findElement(By.id("sex-1")).click();
//		//checkbox
//		driver.findElement(By.id("profession-1")).click();
//		//file select from winform
//		//driver.findElement(By.id("photo")).click();
//		//Runtime.getRuntime().exec("./upload file.exe");
//		driver.findElement(By.id("photo")).sendKeys("D:\\workspace\\autoFramework\\testuploadfile.txt");
//		
//		Thread.sleep(10000);
//		System.out.println("form page is opened.");
//	}
//	
//	//@Test
//	public void smokeTest_ToolsQA_Prompt()
//	{
//		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
//		//.//button[contains(.,'Confirm')]
//		driver.findElement(By.xpath(".//button[contains(.,'Simple Alert')]")).click();
//		driver.findElement(By.xpath(".//button[contains(.,'Confirm Pop up')]")).click();
//		driver.findElement(By.xpath(".//button[contains(.,'Prompt Pop up')]")).click();
//		
//		System.out.println("prompt test page is opened.");
//	}
//	
	
	
	
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

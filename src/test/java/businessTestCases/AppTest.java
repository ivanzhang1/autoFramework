package businessTestCases;

import org.testng.annotations.Test;

import businessComponents.pageObjects.*;
import businessLibaray.commonFunc.SeleniumBase;

import java.net.MalformedURLException;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//it's for slf4j
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.testng.AssertJUnit;

/**
 * Unit test for simple App.
 */
public class AppTest extends SeleniumBase
{
	//private WebDriver driver;
	//private static Logger logger=LoggerFactory.getLogger(AppTest.class);
	//private static Logger logger=LogManager.getLogger(AppTest.class);
    /**
     * Create the test case
     *
     * @param testName name of the test case
     
	
    public AppTest( String testName )
    {
    	
    	System.out.println("this is apptest class of AppTest java file");
    	//webDriverManager.driver
    }
    */
    /**
     * Rigourous Test :-)
     */
    @Test
	public void testApp()
    {
    	//try {
			//WebDriver driver= RemoteDriver();
    		WebDriver driver=driver("FF");
			driver.get("http://www.baidu.com");
			//Thread.sleep(1000);
			driver.quit();
		//}// catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
    	AssertJUnit.assertTrue( true );
    	long id = Thread.currentThread().getId();
        System.out.println("I'm testApp class. Thread id is: " + id);
      //  logger.info("this is info");
    }
    
   // @Test
	public void testApp2()
    {
    	try {
			WebDriver driver= RemoteDriver();
			driver.get("http://www.baidu.com");
			//Thread.sleep(1000);
			driver.quit();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	AssertJUnit.assertTrue( true );
        long id = Thread.currentThread().getId();
        System.out.println("I'm testApp2 class. Thread id is: " + id);
    }
    
    
   // @Test
	public void testApp3()
    {
    	try {
			WebDriver driver= RemoteDriver();
			driver.get("http://www.baidu.com");
			//Thread.sleep(1000);
			driver.quit();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	AssertJUnit.assertTrue( true );
    	long id = Thread.currentThread().getId();
        System.out.println("I'm testApp3 class. Thread id is: " + id);
    }
}

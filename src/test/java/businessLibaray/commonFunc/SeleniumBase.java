package businessLibaray.commonFunc;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumBase {
	private WebDriver base;
	String driverpath="./geckodriver.exe";
	
	
    public WebDriver driver(String browser) {
    	
    	switch(browser)
    	{
    		case "FF":
    			System.out.println("initial the FireFox browser.");
    			System.setProperty("webdriver.gecko.driver", driverpath);
    			this.base=new FirefoxDriver();
    			break;
    			
    		case "IE":
    			System.out.println("initial the IE browser.");
    			break;
    			
    		case "Chrome":
    			System.out.println("initial the Chrome browser.");
    			break;
    			
    	}
		  return this.base;
	  }

	public WebDriver RemoteDriver() throws MalformedURLException{
		
		System.out.println("Try to initial remote webdriver.");
		System.setProperty("webdriver.gecko.driver", driverpath);
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		this.base = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);

		return base;
	}
	
	//@BeforeSuite
	//@AfterSuite


}

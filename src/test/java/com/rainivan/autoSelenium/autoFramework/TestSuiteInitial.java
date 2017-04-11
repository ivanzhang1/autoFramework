package com.rainivan.autoSelenium.autoFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestSuiteInitial {
  @BeforeSuite
  public void beforeSuite() {
	  String driverpath="./geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", driverpath);
  }

  @AfterSuite
  public void afterSuite() {
  }

}

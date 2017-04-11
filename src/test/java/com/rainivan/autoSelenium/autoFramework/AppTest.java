package com.rainivan.autoSelenium.autoFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
    	System.out.println("this is apptest class of AppTest java file");
    	//webDriverManager.driver
    }

    /**
     * Rigourous Test :-)
     */
    @Test
	public void testApp()
    {
        AssertJUnit.assertTrue( true );
        System.out.println("I'm apptest class");
    }
}

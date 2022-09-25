package org.example.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

   public DriverFactory driverFactory = new DriverFactory();

    @Before

    public void setup(){

        driverFactory.openBrowser();

    }// end of set up method

    @After

    public void tearDown(){

        driverFactory.closeBrowser();

    }// end of teardown


}//



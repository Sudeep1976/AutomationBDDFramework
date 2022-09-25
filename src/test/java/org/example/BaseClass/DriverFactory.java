package org.example.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public DriverFactory() {
        PageFactory.initElements(driver, this);
    }// end of driverfactory constructor

    public void openBrowser(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.iceland.co.uk/");

        driver.manage().window().maximize();



    }// end of openbrowser method

    public void closeBrowser(){

        //   driver.quit();

    }



// sudeep jha








}

package org.example.PageObject;

import org.example.BaseClass.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Christmasproductpage extends DriverFactory {


    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='main']/div[2]/div[5]/div[2]/div[1]/ul[1]/li[3]/div[1]/div[4]/div[3]/a[1]")
        WebElement addtobasket;

    public void clickaddTobasket() throws InterruptedException {

        //Initialization of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);

        // Scroll down by 1900 pixels
        js.executeScript("window.scrollBy(0,400); ");
        Thread.sleep(2000);


        addtobasket.click();

    }

    @FindBy(xpath = "//*[@id=\"sticky-close\"]/i")
    WebElement popupmsg;

    public void clearpopupmsg(){
        popupmsg.click();

    }


    }// end of class




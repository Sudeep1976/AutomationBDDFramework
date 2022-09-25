package org.example.PageObject;

import org.example.BaseClass.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends DriverFactory {

    @FindBy(xpath = "//header/div[1]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")
    WebElement christmasbutton;

    public void clickchristmasbutton(){

        christmasbutton.click();

    }


}

package org.example.PageObject;

import org.example.BaseClass.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {

    @FindBy(linkText = "Sign in")
    WebElement signinbutton;

    public void clickSignInButton(){

        signinbutton.click();
    }

    @FindBy(xpath = "//input[@id='header-search']")
    WebElement searchbox;

    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]")
    WebElement magnifyingglass;

    public void searchBoxType(){

        searchbox.sendKeys("Biscuit");
        magnifyingglass.click();
    }

    public void multipleSearch(String item){
        searchbox.sendKeys(item);
        magnifyingglass.click();

    }
}// end of class

package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

/*
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
*/

    @FindBy(id = "user")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongUsernameOrPassword;


    public void Login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginBtn.click();
    }


}

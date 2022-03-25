package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//li//span")
    public List<WebElement> allModules;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='dashboard']//span")
    public WebElement dashboardModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='files']")
    public WebElement filesModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='photos']")
    public WebElement photosModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='activity']")
    public WebElement activityModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='spreed']")
    public WebElement talkModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='mail']")
    public WebElement mailModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='contacts']")
    public WebElement contactsModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='circles']")
    public WebElement circlesModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='calendar']")
    public WebElement calendarModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='deck']")
    public WebElement deckModule;
}
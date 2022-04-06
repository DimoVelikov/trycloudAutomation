package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateSettingsPage {
    public UpdateSettingsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "settings-button")
    public WebElement settingsButton;

    @FindBy(xpath = "//label[@for='showRichWorkspacesToggle']")
    public WebElement showRichWorkspacesToggleButton;

    @FindBy(xpath = "//label[@for='recommendationsEnabledToggle']")
    public WebElement recommendationsEnabledToggleButton;

    @FindBy(xpath = "//label[@for='showhiddenfilesToggle']")
    public WebElement showhiddenfilesToggleButton;

    @FindBy(xpath = "(//div/a[@href='#'])[3]")
    public WebElement plusIcon;

    @FindBy(xpath = "//li/a/p")
    public WebElement storageUsageIcon;

    @FindBy(xpath = "//label/span[@class='svg icon icon-upload']")
    public WebElement uploadIcon;



}
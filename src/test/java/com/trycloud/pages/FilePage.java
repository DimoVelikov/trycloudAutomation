package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilePage extends BasePage {


    @FindBy(xpath = "//a[@aria-label]")
    public List<WebElement> modules;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement actionButton;

    @FindBy(xpath = "//a")
    public List<WebElement> options;

    @FindBy(xpath = "//a")
    public List<WebElement> subModule;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr/td[1]/a/span[1]/span")
    public WebElement fileName;


}

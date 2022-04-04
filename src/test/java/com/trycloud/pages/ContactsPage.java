package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactsPage extends BasePage {

    @FindBy(xpath = "//a[@aria-label]")
    public List<WebElement> modules;


    @FindBy(xpath = "//div[@class='app-content-list-item-line-one'][1]")
    public List<WebElement> contactNames;

}

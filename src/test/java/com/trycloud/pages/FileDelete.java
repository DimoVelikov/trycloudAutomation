package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDelete {

    public FileDelete(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//label[contains(@for,'select-files')]")
    public WebElement select_icons;

    @FindBy(xpath = "(//span[@id='selectedActionsList']//a[@class='actions-selected']//span[@class='icon icon-more'])[1]")
    public WebElement actionsButton;

    @FindBy(xpath = "(//span[text()='Delete'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement deletedFiles;

    @FindBy(xpath = "//span[text()='Collection']")
    public WebElement collectionFile;

}

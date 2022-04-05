package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class DeleteFile {

    public DeleteFile(){

        PageFactory.initElements(Driver.getDriver(),this);

    }



    @FindBy(xpath = "(//span[@id='selectedActionsList']//a[@class='actions-selected']//span[@class='icon icon-more'])[1]")
    public WebElement actionsButton;

    @FindBy(xpath = "(//span[text()='Delete'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement deletedFiles;

    @FindBy(xpath = "//tr[@data-file=\"Talk\"]//label")
    public WebElement talkFileBeforeDelete;

    //span[@class='nametext extra-data' and @data-original-title='Talk' ]//span[@class='innernametext' and text()='Talk'][1]
    @FindBy(xpath = "(//span[@class='nametext extra-data' and @data-original-title='Talk' ]//span[@class='innernametext' and text()='Talk'])[1]")
    public WebElement talkFile;

    @FindBy(xpath = "//span[text()='Deleted']")
    public WebElement deletedButtonOnTopRight;



}

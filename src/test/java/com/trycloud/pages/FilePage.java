package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage {



    public FilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//li[@data-id='files']/a)[1]")
    public WebElement filesModule;



    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;




    @FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolder;



   @FindBy(id = "view13-input-folder")
   public WebElement folderBox;

   @FindBy(xpath = "//input[@class='icon-confirm']")
   public WebElement submitButton;


  @FindBy(xpath = "//span[.='New folder']/span")
   public WebElement newFolderIcon;



}

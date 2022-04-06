package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilePage {



    public FilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//li[@data-id='files']/a)[1]")
    public WebElement filesModule;



    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;




    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement newFolder;



   @FindBy(id = "view13-input-folder")
   public WebElement folderBox;

   @FindBy(xpath = "(//input[@type='submit'])[2]")
   public WebElement submitButton;


  @FindBy(xpath = "//span[@class='innernametext']")
   public List<WebElement> newFolderIcon;


   @FindBy(xpath = "//label[@for='file_upload_start'] ")
    public WebElement uploadFileIcon;

   @FindBy(xpath = "//span[.='Screenshot 2022-03-13 232534']")
    public WebElement newFile;

}

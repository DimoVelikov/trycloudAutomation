package com.trycloud.pages;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


public class FilePage extends BasePage {



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

    @FindBy (id = "commentsTabView")
    public WebElement commentBtn;

    @FindBy (xpath = "//div[@class='message']")
    public WebElement commentInput;

    @FindBy (xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement commentSubmit;



}

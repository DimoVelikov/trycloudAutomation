package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesModule {
    public FilesModule() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "headerSelection")
    public WebElement firstCheckbox;

    @FindBy (xpath = "//tbody/tr")
    public List<WebElement> listCheckboxes;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAllbox;

    @FindBy(xpath = "//td[@class='selection']/input ")
    public List<WebElement> allBoxInFiles;

}

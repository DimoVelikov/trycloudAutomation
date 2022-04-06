package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.FilePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.pool.TypePool;
import org.junit.Assert;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class ManageFolders_StepDef {

    LoginPage loginPage = new LoginPage();

    FilePage filePage=new FilePage();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();

    }
    @When("the user clicks the Files module")
    public void the_user_clicks_the_module() {

       filePage.filesModule.click();

    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {

        filePage.addIcon.click();
    }


    @When("user click new folder")
    public void user_click_new_folder() {
       BrowserUtils.sleep(2);
       filePage.newFolder.click();
    }

    @When("user write a {string}")
    public void user_write_a_folder_name(String folderName) {

        filePage.folderBox.sendKeys(folderName);
        BrowserUtils.sleep(2);

    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10) ;
        wait.until(ExpectedConditions.elementToBeClickable(filePage.submitButton));
       filePage.submitButton.click();

    }

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        List<String>folderName=new ArrayList<>();
        for (WebElement webElement : filePage.newFolderIcon) {
            folderName.add(webElement.getText());
        }

      Driver.getDriver().navigate().refresh();
        System.out.println(folderName);
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      Assert.assertTrue(folderName.contains("farya"));

    }




    @And("user choose a folder from the page")
    public void userChooseAFolderFromThePage() {

        for (WebElement webElement : filePage.newFolderIcon) {
           if(webElement.getText().equals("farya")){
           webElement.click();
           break;
        }


    }

}

    @When("the user uploads a file with the upload file option")
    public void theUserUploadsAFileWithTheUploadFileOption() {

        String filePath="C:\\Users\\12892\\Desktop\\screenshot\\Vytrack\\Screenshot.png";
        filePage.uploadFileIcon.sendKeys(filePath);
    }



    @Then("Verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
        Assert.assertTrue(filePage.newFile.isDisplayed());
    }
}

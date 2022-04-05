package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.DeleteFile;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.NoSuchElementException;

public class US08_Sina {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    DeleteFile deleteFile = new DeleteFile();

/*    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();
        
    }*/
    @When("the user clicks the Files module")
    public void the_user_clicks_the_Files_module() {

        basePage.filesModule.click();
    }
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {

        deleteFile.talkFileBeforeDelete.click();
        deleteFile.actionsButton.click();

    }
    @When("user choose the Delete file option")
    public void user_choose_the_Delete_file_option() {

        deleteFile.deleteButton.click();

    }
    @When("the user clicks the Deleted files sub-module on the left side")
    public void the_user_clicks_the_Deleted_files_sub_module_on_the_left_side() {

        deleteFile.deletedFiles.click();
        deleteFile.deletedButtonOnTopRight.click();


    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {


        Assert.assertTrue(deleteFile.talkFile.isDisplayed());


    }

}

package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.DeleteFile;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08_Sina {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    DeleteFile deleteFile = new DeleteFile();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();
        
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

        basePage.filesModule.click();
    }
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {

        deleteFile.select_icons.click();
        deleteFile.actionsButton.click();

    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

        deleteFile.deleteButton.click();
    }
    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {

        deleteFile.deletedFiles.click();

    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {

        deleteFile.deletedButton.click();
        Assert.assertTrue(deleteFile.talkFile.isDisplayed());
        Driver.closeDriver();
    }



}

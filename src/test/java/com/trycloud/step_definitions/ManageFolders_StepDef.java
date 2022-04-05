package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.FilePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

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

       filePage.newFolder.click();
    }

    @When("user write a {string}")
    public void user_write_a_folder_name(String folderName) {
        filePage.folderBox.sendKeys(folderName);

    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
       filePage.submitButton.click();

    }

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {

        Assert.assertTrue(filePage.newFolderIcon.isDisplayed());

    }






















}

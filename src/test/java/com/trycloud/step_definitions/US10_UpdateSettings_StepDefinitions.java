package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.UpdateSettingsPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.awt.*;

public class US10_UpdateSettings_StepDefinitions {

    UpdateSettingsPage updateSettingsPage = new UpdateSettingsPage();
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String filesModule) {

        basePage.filesModule.click();
    }

    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        updateSettingsPage.settingsButton.click();

    }

    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {


        updateSettingsPage.showRichWorkspacesToggleButton.click();
        Assert.assertTrue(updateSettingsPage.showRichWorkspacesToggleButton.isEnabled());

        updateSettingsPage.recommendationsEnabledToggleButton.click();
        Assert.assertTrue(updateSettingsPage.recommendationsEnabledToggleButton.isEnabled());


        updateSettingsPage.showhiddenfilesToggleButton.click();
        Assert.assertTrue(updateSettingsPage.showhiddenfilesToggleButton.isEnabled());

    }


    @And("user checks the current storage usage")
    public String userChecksTheCurrentStorageUsage() {
        String currentStorage;
        currentStorage = updateSettingsPage.storageUsageIcon.getText();
        return currentStorage;

    }

    @And("user uploads file with the upload file option")
    public void userUploadsFileWithTheUploadFileOption() {
        updateSettingsPage.plusIcon.click();
        String filepath = "C:\\Users\\Dell\\Desktop\\B25-Trycloud .png";
        updateSettingsPage.uploadIcon.sendKeys(filepath);
        updateSettingsPage.uploadIcon.click();


    }

    @And("user refresh the page")
    public void userRefreshThePage() {

        Driver.getDriver().navigate().refresh();
    }

    @Then("the user should be able to see storage usage is increased")
    public void theUserShouldBeAbleToSeeStorageUsageIsIncreased() {


        String newStorageUsage = updateSettingsPage.storageUsageIcon.getText();
       Assert.assertNotEquals(newStorageUsage,userChecksTheCurrentStorageUsage() );


    }

}


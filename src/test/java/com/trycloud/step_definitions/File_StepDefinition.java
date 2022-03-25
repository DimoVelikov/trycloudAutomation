package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.FilesModule;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class File_StepDefinition extends LoginPage {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    FilesModule filesModule = new FilesModule();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameInput.sendKeys("user7");
        loginPage.passwordInput.sendKeys("Userpass123");
        loginPage.loginBtn.click();
    }

    @When("user clicks {string} module")
    public void user_clicks_module(String module) {
     basePage.filesModule.click();
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

//    @When("user click the top-left checkbox of the table")
//    public void user_click_the_top_left_checkbox_of_the_table() {
//        filesModule.selectAllbox.click();
////        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//        loginPage.usernameInput.sendKeys("user7");
//        loginPage.passwordInput.sendKeys("Userpass123");
//        loginPage.loginBtn.click();
//        basePage.filesModule.click();
//        filesModule.firstCheckbox.click();
    @And("user click the top left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        filesModule.selectAllbox.click();
    }

    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        for (WebElement each : filesModule.listCheckboxes) {
            Assert.assertTrue(each.getAttribute("class").contains("selected"));
        }
    }
}

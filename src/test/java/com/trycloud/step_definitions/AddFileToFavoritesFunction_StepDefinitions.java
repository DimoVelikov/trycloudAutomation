package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.FilePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AddFileToFavoritesFunction_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    FilePage filePage = new FilePage();

/*    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();
    }*/


    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

        try {

            for (WebElement eachModule : filePage.modules) {
                if (eachModule.getAttribute("aria-label").equals(string)) {
                    eachModule.click();
                }

            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {

        BrowserUtils.sleep(2);
        filePage.actionButton.click();

    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String option) {
try {
    for (WebElement eachOption : filePage.options) {

        if (eachOption.getText().equalsIgnoreCase(option)) {
            BrowserUtils.sleep(2);
            eachOption.click();
        }

    }

}catch (RuntimeException e){
    System.out.println("CATCHING EXCEPTION");
}

    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String subModule) {

        try {
            for (WebElement eachSubModule : filePage.subModule) {

                if (eachSubModule.getText().equals(subModule)) {
                    eachSubModule.click();
                }

            }
        }catch (RuntimeException e){
            System.out.println("catching exception in subModule");
        }

    }

    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {


       filePage.fileName.isDisplayed();

       Assert.assertTrue(filePage.fileName.getText().contains("Burak"));




    }


}

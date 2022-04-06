package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginFunction_ValidCredential_StepDefinitions {

    LoginPage loginPage = new LoginPage();


    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String username,String passcode) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(passcode);

    }
/*    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginBtn.click();

    }*/
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        String expectedTitle="Dashboard";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

}

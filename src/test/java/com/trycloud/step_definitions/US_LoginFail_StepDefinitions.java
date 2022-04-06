package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_LoginFail_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);

    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginBtn.click();


    }

    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String message) {

        Assert.assertTrue(loginPage.wrongUsernameOrPassword.isDisplayed());
        Assert.assertTrue(loginPage.wrongUsernameOrPassword.getText().contains(message));


    }


}

package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.ContactsPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ViewContactList_stepDefinitions {
    LoginPage loginPage = new LoginPage();
    ContactsPage contactsPage = new ContactsPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();
    }

    @When("the user clicks the {string} modules")
    public void the_user_clicks_the_modules(String string) {
        try {

            for (WebElement eachModule : contactsPage.modules) {
                if (eachModule.getAttribute("aria-label").equals(string)) {
                    eachModule.click();
                }

            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {

        List<String> contactList = new ArrayList<>();
        for (int i = 0; i < contactsPage.contactNames.size(); i++) {
            //  System.out.println("contactsPage.contactNames.get(i) = " + contactsPage.contactNames.get(i).getText());
            contactList.add(contactsPage.contactNames.get(i).getText());

        }
        System.out.println("contactList = " + contactList);
    }

}

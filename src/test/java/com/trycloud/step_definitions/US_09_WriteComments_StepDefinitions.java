package com.trycloud.step_definitions;

import com.trycloud.pages.FilePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_09_WriteComments_StepDefinitions {

    FilePage filePage = new FilePage();

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {

        filePage.commentBtn.click();
        filePage.commentInput.sendKeys("Test commit message");

    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {

        filePage.commentSubmit.click();

    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[.='"+"Test commit message"+"']"));

        Assert.assertTrue(element.isDisplayed());

    }

}

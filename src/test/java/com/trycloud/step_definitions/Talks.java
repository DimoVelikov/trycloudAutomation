package com.trycloud.step_definitions;

import com.trycloud.pages.TalkPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Talks {
    TalkPage talkPage = new TalkPage();

    @When("user search user {string} from the search box")
    public void user_search_user_from_the_search_box(String user) {
        talkPage.conversationBox.sendKeys(user);
        talkPage.allUsers.get(0).click();

    }

    @And("user write {string} message")
    public void use_Write_Message(String expectedMessage) {
        talkPage.messageBox.sendKeys(expectedMessage);
        BrowserUtils.waitFor(2);
    }

    @When("user clicks to submit button")
    public void user_clicks_to_submit_button() {
        talkPage.submitButton.click();
    }

    @Then("the user should be able to see the {string} message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log(String expectedMessage) {
        String actualMessage = talkPage.checkMessage(talkPage.allMessages.size());

        System.out.println("actualMessage = " + actualMessage);

        Assert.assertEquals(expectedMessage, actualMessage);
    }



}

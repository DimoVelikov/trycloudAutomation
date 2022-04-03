package com.trycloud.step_definitions;

import com.trycloud.pages.FileDelete;
import com.trycloud.pages.FilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US08_Sina {

    FileDelete fileDelete = new FileDelete();

    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {

        fileDelete.select_icons.click();
        fileDelete.actionsButton.click();
        fileDelete.deleteButton.click();

    }
    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {

        fileDelete.deletedFiles.click();

    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {

        Assert.assertTrue(fileDelete.collectionFile.isDisplayed());

    }

}

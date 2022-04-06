package com.trycloud.step_definitions;

import com.trycloud.pages.FilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US6_EditFavoritesFiles {

    FilePage filePage = new FilePage();

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        filePage.fileName.isDisplayed();
        Assert.assertFalse("File should not be there", filePage.fileName.getText().contains("Tahmina Folder"));
    }


}

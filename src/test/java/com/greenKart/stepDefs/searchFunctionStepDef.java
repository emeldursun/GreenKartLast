package com.greenKart.stepDefs;

import com.greenKart.pages.BasePage;
import com.greenKart.pages.SearchFunctionPage;
import com.greenKart.utilities.BrowserUtils;
import com.greenKart.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class searchFunctionStepDef extends BasePage {
    SearchFunctionPage SearchFunctionPage = new SearchFunctionPage();

    @When("User clicks on search box")
    public void userClicksOnSearchBox() {

        new SearchFunctionPage().searchButton.click();
        BrowserUtils.waitFor(3);

    }

    @And("User copies the text from the search box.")
    public void userCopiesTheTextFromTheSearchBox() {

        Actions actions = new Actions(Driver.get());

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        BrowserUtils.waitFor(5);

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        BrowserUtils.waitFor(5);
        SearchFunctionPage.searchButton.click();


    }

    @Then("User will be able to copy typed text from and paste it to the search box.")
    public void userWillBeAbleToCopyTypedTextFromAndPasteItToTheSearchBox() {
        Actions actions = new Actions(Driver.get());

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        BrowserUtils.waitFor(5);
    }

    @Then("User will be able to see the typed letters in the search box.")
    public void userWillBeAbleToSeeTheTypedLettersInTheSearchBox() {
       SearchFunctionPage.createRandomCharacter();

    }

    @Then("Verify that the placeholder at the search box should be {string}.")
    public void verifyThatThePlaceholderAtTheSearchBoxShouldBe(String arg0) {
        SearchFunctionPage.getPlaceHolderText();
    }

    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String letter) {

        SearchFunctionPage.searchButton.sendKeys(letter);
        BrowserUtils.waitFor(5);

    }

    @Then("user will see the product results containing {string}")
    public void userWillSeeTheProductResultsContaining(String letter) {

        SearchFunctionPage.searchALetter(letter);

    }
}
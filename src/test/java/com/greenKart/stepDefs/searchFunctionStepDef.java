package com.greenKart.stepDefs;

import com.github.javafaker.Faker;
import com.greenKart.pages.BasePage;
import com.greenKart.pages.ProductPage;
import com.greenKart.pages.SearchFunctionPage;
import com.greenKart.utilities.BrowserUtils;
import com.greenKart.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class searchFunctionStepDef extends BasePage {
    SearchFunctionPage SearchPage = new SearchFunctionPage();
    ProductPage ProductPage= new ProductPage();

    Faker faker = new Faker();


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
        SearchPage.searchButton.click();


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
       SearchPage.createRandomCharacter();

    }

    @Then("Verify that the placeholder at the search box should be {string}.")
    public void verifyThatThePlaceholderAtTheSearchBoxShouldBe(String arg0) {
        SearchPage.getPlaceHolderText();
    }

    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String letter) {

        SearchPage.searchButton.sendKeys(letter);
        BrowserUtils.waitFor(5);

    }

    @Then("user will see the product results containing {string}")
    public void userWillSeeTheProductResultsContaining(String letter) {

        SearchPage.searchALetter(letter);

    }

    @When("User enters random characters in the search box.")
    public void userEntersRandomCharactersInTheSearchBox() {

        ProductPage.searchBoxBefore = ProductPage.searchBox.getText();
        ProductPage.searchBox.sendKeys(faker.letterify("??"));
    }

    @Then("User will be able to type in the search box.")
    public void userWillBeAbleToTypeInTheSearchBox() {

        ProductPage.searchBoxAfter= ProductPage.searchBox.getText();

        Assert.assertNotSame(ProductPage.searchBoxBefore, ProductPage.searchBoxAfter);

        System.out.println("ProductPage.searchBoxBefore = " + ProductPage.searchBoxBefore);
    }

    @When("User enters a random product")
    public void userEntersARandomProduct() {

        getRandomProductName();
        SearchPage.searchButton.sendKeys(randomName);
    }

    @Then("User will be able to find that product.")
    public void userWillBeAbleToFindThatProduct() {

        String typedProduct=Driver.get().findElement(By.xpath("//input[@type='search']")).getAttribute("value");

        BrowserUtils.waitFor(3);

        List<WebElement> products = Driver.get().findElements(By.xpath("//div/h4[@class='product-name']"));
        List<String> productString = BrowserUtils.getElementsText(products);

        BrowserUtils.waitFor(5);

        System.out.println("typedProduct = " + typedProduct);
        System.out.println("productString = " + productString);

        Assert.assertTrue("verify that ",productString.contains(typedProduct));



    }
}
package com.greenKart.stepDefs;

import com.github.javafaker.Faker;
import com.greenKart.pages.BasePage;
import com.greenKart.pages.ProductPage;
import com.greenKart.utilities.BrowserUtils;
import com.greenKart.utilities.ConfigurationReader;
import com.greenKart.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Random;

import static java.lang.Integer.parseInt;


public class addToCart extends BasePage {

    Random random=new Random();
    Faker faker= new Faker();

    ProductPage ProductPage = new ProductPage();


    @When("the user navigate to product page")
    public void theUserNavigateToProductPage() {
        String url= ConfigurationReader.get("Url");
        Driver.get().get(url);

        BrowserUtils.waitForPageToLoad(5);
    }

    @Given("user navigates to the link")
    public void userNavigatesToTheLink() {

        Driver.get().get(ConfigurationReader.get("Url"));

        BrowserUtils.waitForPageToLoad(5);
    }

    @Then("user should see all the {string} displayed on product page.")

        public void userShouldSeeAllTheDisplayedOnProductPage(String expectedProductsName) {

            List<String> productNames = BrowserUtils.getElementsText(new ProductPage().ActualproductsName);

            System.out.println("productNames = " + productNames);
//            System.out.println("expectedProductsName = " + expectedProductsName);
//
//            Assert.assertEquals(productNames,expectedProductsName);

        }


    @When("user should click on the add to cart button")
    public void userShouldClickOnTheAddToCartButton() throws InterruptedException {


        int randomButton= random.nextInt(ProductPage.AddToCartButtons.size());
        ProductPage.AddToCartButtons.get(randomButton).click();

//      BrowserUtils.waitForPageToLoad(5);

    }

    @Then("add to cart button is clicked")
    public void addToCartButtonIsClicked() {

        System.out.println("this means it is clicked");

//       BrowserUtils.waitForVisibility(ProductPage.addedButton,5);
//        BrowserUtils.waitFor(5);
        Assert.assertTrue(ProductPage.addedButton.isEnabled());




    }



    @When("user clicks the increment button.")
    public void userClicksTheIncrementButton() {

       getRandomIncrement();
    }

    @Then("Verify that the product increases.")
    public void verifyThatTheProductIncreases() {

        Assert.assertTrue(ProductPage.twoProducts.isDisplayed());
    }


    @When("user adds a product")
    public void userAddsAProduct() {

        beforePrice=parseInt(ProductPage.price.getText());

        getRandomProduct();
    }

    @Then("user should see the price of the cart increased")
    public void userShouldSeeThePriceOfTheCartIncreased() {

        afterPrice=parseInt(ProductPage.price.getText());


        Assert.assertNotEquals(beforePrice, afterPrice);




    }




    @When("user adds {string} {string}")
    public void userAdds(String quantity, String product) {

        product=randomName;




        }

    @When("user adds random quantity {string} to cart")
    public void userAddsRandomQuantityToCart(String arg0) {

        quantityBox.clear();
//        quantityBox.sendKeys(faker.);




    }

//
//    @When("User clicks on search box")
//    public void userClicksOnSearchBox() {
//    }
}




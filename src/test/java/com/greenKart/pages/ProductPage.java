package com.greenKart.pages;

import com.greenKart.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{

    public static String searchBoxBefore;
    public static String searchBoxAfter;


    @FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
    public List<WebElement> AddToCartButtons;

    @FindBy(xpath = "//button[contains(text(),'✔ ADDED')]")
    public WebElement addedButton;

    @FindBy(xpath = "//*[@value='2']")
    public WebElement twoProducts;

    @FindBy(xpath = "//table/tbody/tr[2]/td[3]/strong")
    public WebElement price;

    @FindBy (xpath = "//*//form/input")
    public WebElement searchBox;





    public void quantity(String count,String product){

        getRandomProduct();

        String quantitylocator = "//div/input[@class='" + count +"']";
        WebElement quantityelement = Driver.get().findElement(By.xpath(quantitylocator));

        count= quantityelement.getText();

        String productlocator = "//h4[contains(text(),'" + product + "')]//following-sibling::div[2]/button";
        WebElement productelement = Driver.get().findElement(By.xpath(productlocator));
        productelement.click();

    }
}

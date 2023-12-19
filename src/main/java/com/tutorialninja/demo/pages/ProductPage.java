package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    @CacheLookup
    @FindBy(css = "div[id='content'] h1")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-option225']")
    WebElement deliveryDate;

    @CacheLookup
    @FindBy(name = "quantity")
    WebElement Qty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement click;

    public String verifyProductName() {
        String verifyText = getTextFromElement(text);
        log.info("Get product name from : " + text.toString());
        return verifyText;
    }

    public void selectDeliverDate(String date) {
        clearTextFromField((By) deliveryDate);
        log.info("clear field : " + deliveryDate.toString());
        sendTextToElement(deliveryDate, date);
        log.info("Enter date : " + date + " in delivery date field " + deliveryDate.toString());
    }

    public void enterQty(String value) {
        clearTextFromField((By) Qty);
        log.info("clear field : " + Qty.toString());
        sendTextToElement(Qty, value);
        log.info("Enter Qty : " + Qty + " in Qty field " + Qty.toString());
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
        log.info("Clicking Add to cart button : " + addToCart.toString());
    }

    public String verifySuccessMessageToAddInCart() {
        String successMessage = getTextFromElement(message);
        log.info("Get success message from : " + message.toString());
        return successMessage;
    }

    public void clickOnShoppingCart() {
        clickOnElement(click);
        log.info("Clicking shopping cart button : " + click.toString());
    }
}

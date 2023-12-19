package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MacBookPage extends Utility {

    private static final Logger log = LogManager.getLogger(MacBookPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement checkTextMacBook;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessageForAddingProduct;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement linkToShoppingCartInsideMessage;

    public String verifyTheTextMacBook() {
        String macBook = getTextFromElement(checkTextMacBook);
        log.info("Get Mac Book text : " + checkTextMacBook.toString());
        return macBook;
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("Clicking on add to cart from : " + addToCart.toString());
    }

    public String verifySuccessMessageForAddingProductToShoppingCart() {
        String successMessage = getTextFromElement(successMessageForAddingProduct);
        log.info("Get adding cart successfully message : " + successMessageForAddingProduct.toString());
        return successMessage;
    }

    public void clickOnLinkToShoppingCartMessage() {
        clickOnElement(linkToShoppingCartInsideMessage);
        log.info("Clicking on shopping cart link : " + linkToShoppingCartInsideMessage.toString());
    }
}

package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement date;

//    @CacheLookup
//    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
//    WebElement model;
//
//    @CacheLookup
//    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
//    WebElement total;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'MacBook')])[2]")
    WebElement checkNameOfProductMacBook;

    @CacheLookup
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement clearTheQtyBox;

    @CacheLookup
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement changeQuantity;

    @CacheLookup
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement updateTheBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement modifiedSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "(//td[contains(text(),'£737.45')])[3]")
    WebElement totalPrice;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkOutButton;


    public String verifyShoppingCartText() {
        String shoppingCart = getTextFromElement(text);
        log.info("Get Shopping cart text : " + text.toString());
        return shoppingCart;
    }

    public String verifyProductName() {
        String product = getTextFromElement(productName);
        log.info("Get product name : " + productName.toString());
        return product;
    }

    public String verifyDate() {
        String Date = getTextFromElement(date);
        log.info("Get Date : " + date.toString());
        return Date;
    }

    public String verifyModel() {
        String Model = getTextFromElement(model);
        log.info("Get model : " + model.toString());
        return Model;
    }

    public String verifyPrice() {
        String Total = getTextFromElement(price);
        log.info("Get total : " + price.toString());
        return Total;
    }

    public String verifyProductNameIsMacBook() {
        String product = getTextFromElement(checkNameOfProductMacBook);
        log.info("Get product name : " + checkNameOfProductMacBook.toString());
        return product;
    }

    public void clearTheQtyBox() {
        clickOnElement (clearTheQtyBox);
        log.info("Clear text : " + clearTheQtyBox.toString());
    }

    public void enterQuantityIntoTheBox(String qty) {
        sendTextToElement(changeQuantity, qty);
        log.info("Enter qty : " + qty + " in qty box " + changeQuantity.toString());
    }

    public void clickOnUpdateTheQuantityBox() {
        clickOnElement(updateTheBox);
        log.info("Clicking on update the box button : " + updateTheBox.toString());
    }

    public String verifyUpdatedSuccessMessage() {
        String message = getTextFromElement(modifiedSuccessMessage);
        log.info("Get success message : " + modifiedSuccessMessage.toString());
        return message;
    }

    public String verifyTotalPrice() {
        String price = getTextFromElement(totalPrice);
        log.info("Get total price : " + totalPrice.toString());
        return price;
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
        log.info("Clicking check out button : " + checkOutButton.toString());
    }
}

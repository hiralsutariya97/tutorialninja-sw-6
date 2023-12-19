package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopAndBooksPage extends Utility {

    private static final Logger log = LogManager.getLogger(LaptopAndBooksPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "(//select[@id='input-sort'])[1]")
    WebElement sortByPriceHighToLow;

    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    WebElement arrayListOfProducts;

//    @CacheLookup
//    @FindBy(id = "input-sort")
//    WebElement price;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement product;

    public void selectSortByPriceHighToLow(String options) {
        selectByVisibleTextFromDropDown(sortByPriceHighToLow, options);
        log.info("select text : " + options + " from dropdown " + sortByPriceHighToLow.toString());
        getArrayListOfProductsInChoice(arrayListOfProducts);
        log.info("get array list : " + arrayListOfProducts.toString());

    }

    public String verifyProductPriceArrangeInHighToLow() {
        String highToLow = verifyTheProductArrangementInArrayList(arrayListOfProducts);
        log.info("Get products arrangement in high to low order : " + arrayListOfProducts.toString());
        return highToLow;
    }

//    public void sortByPrice(String option) {
//        selectByVisibleTextFromDropDown(price, option);
//        log.info("select text : " + option + " from dropdown " + price.toString());
//    }

    public void selectMacBookProduct() {
        clickOnElement(product);
        log.info("Clicking on product from : " + product.toString());
    }
}

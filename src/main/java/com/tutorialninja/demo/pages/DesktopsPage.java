package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> listOfProduct;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement descendingOrder;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement ascendingOrder;

    @CacheLookup
    @FindBy(tagName = "(//div[@class='row'])[6]")
    WebElement product;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='product-category']/div[@class='row']/div[@id='content']")
    WebElement products;


    public void verifySortedElementsInReverseOrder() {
        List<WebElement> elements = listOfProduct;
        ArrayList<String> originalElementList = new ArrayList<>();
        for (WebElement e : elements) {
            originalElementList.add(e.getText());
        }
        System.out.println(originalElementList);

        Collections.reverse(originalElementList);
        System.out.println(originalElementList);

        elements = listOfProduct;
        ArrayList<String> afterSortByReverseList = new ArrayList<>();
        for (WebElement e : elements) {
            afterSortByReverseList.add(e.getText());
        }
        System.out.println(afterSortByReverseList);
        log.info("Get elements sorted in reverse order" + descendingOrder.toString());

    }

    public void selectSortByOption(String option) {
        selectByVisibleTextFromDropDown(descendingOrder, option);
        log.info("Select sortBy " + option + " in descending order " + descendingOrder.toString());

    }

    public void sortByNameAToZPosition(String option) {
        selectByVisibleTextFromDropDown(ascendingOrder, option);
        log.info("Select sortBy " + option + " in ascending order " + ascendingOrder.toString());
    }

    public void selectProduct(String products) {
        sendTextToElement(product, products);
        mouseHoverToElementAndClick(product);
        log.info("Select product from " + products + product.toString());
    }

    public void selectProductsOption(String products) {
        WebElement productList = driver.findElement(By.linkText(products));
        Actions actions = new Actions(driver);
        actions.moveToElement(productList).click().build().perform();
    }
}

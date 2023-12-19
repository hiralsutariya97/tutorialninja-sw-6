package com.tutorialninja.demo.steps;

import com.tutorialninja.demo.pages.DesktopsPage;
import com.tutorialninja.demo.pages.HomePage;
import com.tutorialninja.demo.pages.ProductPage;
import com.tutorialninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopsSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on Desktops tab")
    public void iClickOnDesktopsTab() {
        new HomePage().clickOnDesktopTab();
    }

    @And("I call selectMenu and pass all desktop {string}")
    public void iCallSelectMenuAndPassAllDesktop(String allDesktop) {
        new HomePage().selectMenu(allDesktop);
    }

    @And("I click on sort by position Z to A {string}")
    public void iClickOnSortByPositionZToA(String descending) {
        new DesktopsPage().selectSortByOption(descending);
    }

    @Then("I can see the product will be arrange in descending order")
    public void iCanSeeTheProductWillBeArrangeInDescendingOrder() {
        new DesktopsPage().verifySortedElementsInReverseOrder();
    }

    @When("I click on currency dropdown")
    public void iClickOnCurrencyDropdown() {
        new HomePage().mouseHoverOnCurrencyDropdownAndClick();
    }

    @And("I click on £pound Sterling")
    public void iClickOn£poundSterling() {
        new HomePage().mouseHoverOnPoundAndClick();
    }

    @And("I click on sort by position A to Z {string}")
    public void iClickOnSortByPositionAToZ(String ascending) {
        new DesktopsPage().sortByNameAToZPosition(ascending);
    }

    @And("I select the product {string}")
    public void iSelectTheProduct(String product) {
        new DesktopsPage().selectProductsOption(product);
    }

    @And("I get the text product {string}")
    public void iGetTheTextProduct(String productText) {
        Assert.assertEquals(new ProductPage().verifyProductName(), productText, "Incorrect Text");
    }

    @And("I enter qty oe using select class")
    public void iEnterQtyOeUsingSelectClass() {
        new ProductPage().enterQty("1");
    }

    @And("I click on add to crt button")
    public void iClickOnAddToCrtButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("I get the message Success: You have added {string} to your shopping cart!")
    public void iGetTheMessageSuccessYouHaveAddedToYourShoppingCart(String product) {
        String expected = "Success: You have added " + product + " to your shopping cart!\n" + "×";
        String actual = new ProductPage().verifySuccessMessageToAddInCart();
        Assert.assertEquals(actual, expected, "Incorrect message");
    }

    @And("I click on shopping cart display into the success message")
    public void iClickOnShoppingCartDisplayIntoTheSuccessMessage() {
        new ProductPage().clickOnShoppingCart();
    }

    @Then("I get the product name {string}")
    public void iGetTheProductName(String productName) {
        Assert.assertEquals(new ShoppingCartPage().verifyProductName(), productName, "Incorrect name");
    }

    @Then("I get the model name {string}")
    public void iGetTheModelName(String modelName) {
        Assert.assertEquals(new ShoppingCartPage().verifyModel(), modelName, "Incorrect model");
    }

    @Then("I get the price {string}")
    public void iGetThePrice(String price) {
        Assert.assertEquals(new ShoppingCartPage().verifyPrice(), price, "Incorrect price");
    }
}

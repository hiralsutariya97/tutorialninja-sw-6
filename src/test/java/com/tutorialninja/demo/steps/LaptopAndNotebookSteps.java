package com.tutorialninja.demo.steps;

import com.tutorialninja.demo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LaptopAndNotebookSteps {
    @When("I click on Laptop and Notebooks tab")
    public void iClickOnLaptopAndNotebooksTab() {
        new HomePage().clickOnLaptopAndNotebook();

    }

    @And("I call selectMenu and pass all laptop and notebook {string}")
    public void iCallSelectMenuAndPassAllLaptopAndNotebook(String allLaptopAndNotebooks) {
        new HomePage().selectMenu(allLaptopAndNotebooks);
    }

    @And("I should navigate to laptop and notebook page")
    public void iShouldNavigateToLaptopAndNotebookPage() {
    }

    @And("I click on sort by price {string}")
    public void iClickOnSortByPrice(String price) {
        new LaptopAndBooksPage().selectSortByPriceHighToLow(price);
    }

    @Then("I can see the product price will be arrange in high to low order")
    public void iCanSeeTheProductPriceWillBeArrangeInHighToLowOrder() {
        String actualPrice = new LaptopAndBooksPage().verifyProductPriceArrangeInHighToLow();
        String expectedPrice = "$2,000.00";
        String expectedMessage = expectedPrice + "\n" +
                "Ex Tax:" + expectedPrice;
        Assert.assertEquals(actualPrice, expectedMessage, "Incorrect price  order!");
    }

    @And("I click on macbook")
    public void iClickOnMacbook() {
        new LaptopAndBooksPage().selectMacBookProduct();
    }

    @And("I get a text macbook {string}")
    public void iGetATextMacbook(String productName) {
        Assert.assertEquals(new MacBookPage().verifyTheTextMacBook(), productName, "Incorrect product name");
    }

    @And("I click on the add to cart button")
    public void iClickOnTheAddToCartButton() {
        new MacBookPage().clickOnAddToCart();
    }

    @And("I get a message for macbook is Success: You have added MacBook to your shopping cart!")
    public void iGetAMessageForMacbookIsSuccessYouHaveAddedMacBookToYourShoppingCart() {
        String expectedSuccessMessage = "Success: You have added MacBook to your shopping cart!\n×";
        String actualSuccessMessage = new MacBookPage().verifySuccessMessageForAddingProductToShoppingCart();
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "Invalid Success Message!");
    }

    @And("I click on shopping cart display into the success message for macbook")
    public void iClickOnShoppingCartDisplayIntoTheSuccessMessageForMacbook() {
        new MacBookPage().clickOnLinkToShoppingCartMessage();
    }

    @And("I get a shopping cart text {string}")
    public void iGetAShoppingCartText(String shoppingCart) {
        Assert.assertEquals(new ShoppingCartPage().verifyShoppingCartText(), shoppingCart, "Incorrect text");
    }

    @And("I get a macbook product name {string}")
    public void iGetAMacbookProductName(String productMacbook) {
        Assert.assertEquals(new ShoppingCartPage().verifyProductNameIsMacBook(), productMacbook, "Incorrect product name displayed");
    }

    @And("I change the qty to {string}")
    public void iChangeTheQtyTo(String qty) {
        new ShoppingCartPage().clearTheQtyBox();
        new ShoppingCartPage().enterQuantityIntoTheBox(qty);
    }

    @And("I click on update tab")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdateTheQuantityBox();
    }

    @And("I get a modify cart message Success: You have modified your shopping cart!")
    public void iGetAModifyCartMessageSuccessYouHaveModifiedYourShoppingCart() {
        String expectedUpdatedMessage = "Success: You have modified your shopping cart!\n×";
        String actualUpdatedMessage = new ShoppingCartPage().verifyUpdatedSuccessMessage();
        Assert.assertEquals(actualUpdatedMessage, expectedUpdatedMessage, "Incorrect updated message displayed!");
    }

    @And("I get a price for macbook {string}")
    public void iGetAPriceForMacbook(String price) {
        Assert.assertEquals(new ShoppingCartPage().verifyTotalPrice(), price, "Incorrect price");
    }

    @And("I click on check out button")
    public void iClickOnCheckOutButton() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

    @And("I get a checkout text is {string}")
    public void iGetACheckoutTextIs(String text) {
        Assert.assertEquals(new CheckOutPage().verifyCheckOutText(), text, "Incorrect text");
    }

    @And("I get new customer text is {string}")
    public void iGetNewCustomerTextIs(String newCustomer) {
        Assert.assertEquals(new CheckOutPage().verifyTextNewCustomer(), newCustomer, "Incorrect text");
    }

    @And("I click on guest checkout button")
    public void iClickOnGuestCheckoutButton() {
        new CheckOutPage().clickOnGuestCheckOutButton();
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnContinueButtonTab();
    }

    @And("I fill all mandatory fields")
    public void iFillAllMandatoryFields() {
        new CheckOutPage().fillAllMandatoryField("Tiger", "Shroff", "tigershroff123@gmail.com", "0987654321",
                "Tapovan", "Surat", "3450789", "India", "Gujarat");
    }

    @And("I click on continue button for guest")
    public void iClickOnContinueButtonForGuest() {
        new CheckOutPage().clickOnContinueButtonForGuest();
    }

    @And("I add comment about order in text area")
    public void iAddCommentAboutOrderInTextArea() {
        new CheckOutPage().addCommentsAboutYourOrderIntoTheTextArea("Leave my order by door");
    }

    @And("I check the terms and conditions")
    public void iCheckTheTermsAndConditions() {
        new CheckOutPage().clickOnCheckBoxForTermsAndConditions();
    }

    @And("I click on continue button for payment method")
    public void iClickOnContinueButtonForPaymentMethod() {
        new CheckOutPage().clickOnContinueButtonForPaymentMethod();
    }

    @Then("I get a warning message Warning: Payment method required!")
    public void iGetAWarningMessageWarningPaymentMethodRequired() {
        String expectedWarningText = "Warning: Payment method required!\n×";
        String actualWarningText = new CheckOutPage().verifyWarningMessageForPaymentMethod();
        Assert.assertEquals(actualWarningText, expectedWarningText, "Incorrect warning message displayed!");

    }
}

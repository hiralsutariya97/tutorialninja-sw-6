package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement checkOutText;

    @CacheLookup
    @FindBy(xpath = "(//h2[normalize-space()='New Customer'])[1]")
    WebElement checkNewCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckoutButton;

    @CacheLookup
    @FindBy(css = "#button-account")
    WebElement continueTabButton;

    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement emailAddress;

    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephone;

    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement addressField;

    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement cityName;

    @CacheLookup
    @FindBy(name = "postcode")
    WebElement zipCode;

    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement countryName;

    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement zoneName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement addCommentIn;

    @CacheLookup
    @FindBy(css = "input[value='1'][name='agree']")
    WebElement termsAndConditions;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonForPayment;

    @CacheLookup
    @FindBy(xpath = "//div[@class ='alert alert-danger alert-dismissible']")
    WebElement checkWarningForPayment;


    public String verifyCheckOutText() {
        String checkout = getTextFromElement(checkOutText);
        log.info("Get checkout text from : " + checkOutText.toString());
        return checkout;
    }

    public String verifyTextNewCustomer() {
        String newCustomer = getTextFromElement(checkNewCustomerText);
        log.info("Get new customer text from : " + checkNewCustomerText.toString());
        return newCustomer;
    }

    public void clickOnGuestCheckOutButton() {
        clickOnElement(guestCheckoutButton);
        log.info("Clicking on guest checkout button from : " + guestCheckoutButton.toString());
    }

    public void clickOnContinueButtonTab() {
        clickOnElement(continueTabButton);
        log.info("Clicking on continue button : " + continueTabButton.toString());
    }

    public void fillAllMandatoryField(String name, String surname, String email, String phone,
                                      String address, String city, String postcode, String country, String zone) {
        sendTextToElement(firstName, name);
        sendTextToElement(lastName, surname);
        sendTextToElement(emailAddress, email);
        sendTextToElement(telephone, phone);
        sendTextToElement(addressField, address);
        sendTextToElement(cityName, city);
        sendTextToElement(zipCode, postcode);
        selectByVisibleTextFromDropDown(countryName, country);
        selectByVisibleTextFromDropDown(zoneName, zone);
    }

    public void clickOnContinueButtonForGuest() {
        clickOnElement(continueButton);
        log.info("Clicking on continue button : " + continueButton.toString());

    }

    public void addCommentsAboutYourOrderIntoTheTextArea(String comment) {
        sendTextToElement(addCommentIn, comment);
        log.info("Enter comment : " + comment + " in comment area " + addCommentIn.toString());
    }

    public void clickOnCheckBoxForTermsAndConditions() {
        clickOnElement(termsAndConditions);
        log.info("Clicking on terms and condition : " + termsAndConditions.toString());
    }

    public void clickOnContinueButtonForPaymentMethod() {
        clickOnElement(continueButtonForPayment);
        log.info("Clicking on continue button : " + continueButtonForPayment.toString());
    }

    public String verifyWarningMessageForPaymentMethod() {
        String paymentMethod = getTextFromElement(checkWarningForPayment);
        log.info("Get warning message for payment method from : " + checkWarningForPayment.toString());
        return paymentMethod;
    }

}

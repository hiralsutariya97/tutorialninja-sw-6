package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement registerAccount;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement returningCustomerText;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneNumber;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement subscribeRadioButton;

    @CacheLookup
    @FindBy(css = "input[value='1'][name='agree']")
    WebElement privacyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    public String verifyRegisterAccountText() {
        String registerText = getTextFromElement(registerAccount);
        log.info("Get Register account text : " + registerAccount.toString());
        return registerText;
    }

    public String verifyTextReturningCustomerOnLoginPage() {
        String returningCustomer = getTextFromElement(returningCustomerText);
        log.info("Get Register account text : " + returningCustomerText.toString());
        return returningCustomer;
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
        log.info("Enter First name : " + name + " in first name field " + firstName.toString());
    }

    public void enterLastName(String surname) {
        sendTextToElement(lastName, surname);
        log.info("Enter surname : " + surname + " in last name field " + lastName.toString());
    }

    final String randomEmail = randomEmail();

    public void enterEmail(String emailAddress) {
        sendTextToElement(email, emailAddress);
        log.info("Enter email : " + emailAddress + " in email field " + email.toString());
    }

    public static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
    }

    public void enterTelephoneNumber(String phone) {
        sendTextToElement(telephoneNumber, phone);
        log.info("Enter telephone number : " + phone + " in number field " + telephoneNumber.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter password : " + password + " in password field " + passwordField.toString());
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
        log.info("Enter confirm password: " + confirmPassword + " in confirm password field " + confirmPasswordField.toString());
    }

    public void clickOnSubscribeRadioButton() {
        clickOnElement(subscribeRadioButton);
        log.info("Clicking on subscribe radio button : " + subscribeRadioButton.toString());
    }

    public void clickOnPrivacyPolicyCheckBox() {
        clickOnElement(privacyCheckBox);
        log.info("Clicking on privacy box button : " + privacyCheckBox.toString());
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Clicking on continue button : " + continueButton.toString());
    }
}

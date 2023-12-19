package com.tutorialninja.demo.steps;

import com.tutorialninja.demo.pages.HomePage;
import com.tutorialninja.demo.pages.MyAccountPage;
import com.tutorialninja.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountSteps {
    @When("I click on my account link")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnAccountLink();
    }

    @And("I call the method select my account option and pass parameter {string}")
    public void iCallTheMethodSelectMyAccountOptionAndPassParameter(String parameter) {
        new MyAccountPage().selectOption(parameter);
    }

    @And("I should navigate to register page")
    public void iShouldNavigateToRegisterPage() {
    }

    @Then("I get a register text {string}")
    public void iGetARegisterText(String register) {
        Assert.assertEquals(new RegisterPage().verifyRegisterAccountText(), register, "Incorrect Text");
    }

    @Then("I get a login page text {string}")
    public void iGetALoginPageText(String login) {
        Assert.assertEquals(new RegisterPage().verifyTextReturningCustomerOnLoginPage(), login, "Incorrect Text");
    }

    @And("I enter first name")
    public void iEnterFirstName() {
        new RegisterPage().enterFirstName("Tiger");
    }

    @And("I enter last name")
    public void iEnterLastName() {
        new RegisterPage().enterLastName("Shroff");
    }

    @And("I enter email")
    public void iEnterEmail() {
        final String randomEmail;
        randomEmail = RegisterPage.randomEmail();
        new RegisterPage().enterEmail(randomEmail);
    }

    @And("I enter telephone")
    public void iEnterTelephone() {
        new RegisterPage().enterTelephoneNumber("2343234561");
    }

    @And("I enter password")
    public void iEnterPassword() {
        new RegisterPage().enterPassword("123456");
    }

    @And("I enter confirm password")
    public void iEnterConfirmPassword() {
        new RegisterPage().enterConfirmPassword("123456");
    }

    @And("I select yes radio button for subscription")
    public void iSelectYesRadioButtonForSubscription() {
        new RegisterPage().clickOnSubscribeRadioButton();
    }

    @And("I click on privacy policy check box")
    public void iClickOnPrivacyPolicyCheckBox() {
        new RegisterPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("I click on continue")
    public void iClickOnContinue() {
        new RegisterPage().clickOnContinueButton();
    }

    @And("I  get account creation message {string}")
    public void iGetAccountCreationMessage(String accountCreate) {
        Assert.assertEquals(new MyAccountPage().verifyTheMessageYourAccountHasBeenCreated(), accountCreate, "Incorrect Message");
    }

    @And("I click on click after account creation message")
    public void iClickOnClickAfterAccountCreationMessage() {
        new MyAccountPage().clickOnContinueAccountButton();
    }

    @Then("I get a logout text {string}")
    public void iGetALogoutText(String text) {
        Assert.assertEquals(new MyAccountPage().verifyTextForAccountLogOut(), text, "Incorrect Message");
    }

    @Then("I click on continue logOut button")
    public void iClickOnContinueLogOutButton() {
        new MyAccountPage().clickOnContinueLogOutButton();
    }

    @And("I enter email address")
    public void iEnterEmailAddress() {
        new RegisterPage().enterEmail("tigershroff123@gmail.com");
    }

    @And("I enter password to login")
    public void iEnterPasswordToLogin() {
        new RegisterPage().enterPassword("123456");
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new MyAccountPage().clickOnLoginButton();
    }

    @And("I navigate to my account")
    public void iNavigateToMyAccount() {
    }

    @And("I get a account text {string}")
    public void iGetAAccountText(String myAccount) {
        Assert.assertEquals(new MyAccountPage().verifyTheTextMyAccount(), myAccount, "Incorrect Text");
    }


}

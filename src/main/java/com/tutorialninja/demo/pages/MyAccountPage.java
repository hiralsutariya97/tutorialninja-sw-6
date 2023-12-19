package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement accountCreation;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement continueAccountButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement accountLogOutText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueLogOutButton;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement checkTextForMyAccount;

    @CacheLookup
    @FindBy(xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    WebElement clickOnOption;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement clickOnMyAccount;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement accountLink;


    public String verifyTheMessageYourAccountHasBeenCreated() {
        String account = getTextFromElement(accountCreation);
        log.info("Get account creation text : " + accountCreation.toString());
        return account;
    }

    public void clickOnContinueAccountButton() {
        clickOnElement(continueAccountButton);
        log.info("Clicking on continue account button : " + continueAccountButton.toString());
    }

    public String verifyTextForAccountLogOut() {
        String accountLogout = getTextFromElement(accountLogOutText);
        log.info("Get account creation text : " + accountLogOutText.toString());
        return accountLogout;
    }

    public void clickOnContinueLogOutButton() {
        clickOnElement(continueLogOutButton);
        log.info("Clicking on logout button : " + continueLogOutButton.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on login button : " + loginButton.toString());
    }

    public String verifyTheTextMyAccount() {
        String myAccount = getTextFromElement(checkTextForMyAccount);
        log.info("Get My Account text : " + checkTextForMyAccount.toString());
        return myAccount;
    }

//    public void selectMyAccountOptions(String option) {
//        listOfProductsElement(clickOnOption, option);
//    }

    public void selectOption(String option) {
        WebElement menuList = driver.findElement(By.linkText(option));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuList).click().build().perform();
        log.info("get array list : " + option + menuList.toString());
    }

    public void clickOnMyAccountLink() {
        mouseHoverToElementAndClick(clickOnMyAccount);
        log.info("Clicking on my account link : " + clickOnMyAccount.toString());
    }

//    public void clickOnMyAccount() {
//        // Implement a method to wait for the element to be present before clicking
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.presenceOfElementLocated((By) accountLink)).click();
//    }

}

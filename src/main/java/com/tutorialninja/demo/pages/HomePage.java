package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
    WebElement laptopAndNotebook;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Laptops & Notebooks']")
    WebElement laptopAndNoteBookText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Components']")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Components']")
    WebElement componentsText;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
    WebElement dropdown;

    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='£Pound Sterling'])[1]")
    WebElement sterling;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement accountLink;


    public void selectMenu(String menu) {
        WebElement menuList = driver.findElement(By.linkText(menu));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuList).click().build().perform();
        log.info("Select menu from : " + menu + menuList.toString());
    }
//        List<WebElement> topMenuList = getListOfElements(topMenu);
//        try {
//            for (WebElement element : topMenuList) {
//                if (element.getText().equalsIgnoreCase(menu)) {
//                    element.click();
//                }
//            }
//        } catch (StaleElementReferenceException e) {
//            topMenuList = getListOfElements(topMenu);
//        }


    public void clickOnDesktopTab() {
        mouseHoverToElementAndClick(desktop);
        log.info("Clicking on desktop from : " + desktop.toString());
    }

    public String verifyDesktopsText() {
        String desktop = getTextFromElement(desktopText);
        log.info("Clicking on desktop from : " + desktopText.toString());
        return desktop;
    }

    public void clickOnLaptopAndNotebook() {
        mouseHoverToElementAndClick(laptopAndNotebook);
        log.info("Clicking on laptop and notebook from : " + laptopAndNotebook.toString());
    }

    public String verifyLaptopAndNoteText() {
        String laptopAndNotebook = getTextFromElement(laptopAndNoteBookText);
        log.info("Clicking on desktop from : " + laptopAndNoteBookText.toString());
        return laptopAndNotebook;
    }

    public void clickOnComponents() {
        mouseHoverToElementAndClick(components);
        log.info("Clicking on components from : " + components.toString());
    }

    public String verifyComponentsText() {
        String component = getTextFromElement(componentsText);
        log.info("Clicking on desktop from : " + componentsText.toString());
        return component;
    }

    public void mouseHoverOnCurrencyDropdownAndClick() {
        mouseHoverToElementAndClick(dropdown);
        log.info("Clicking on dropdown from : " + dropdown.toString());
    }

    public void mouseHoverOnPoundAndClick() {
        mouseHoverToElementAndClick(sterling);
        log.info("Clicking on sterling from dropdown : " + sterling.toString());
    }

    public void clickOnAccountLink() {
        mouseHoverToElementAndClick(accountLink);
        log.info("Clicking on account link : " + accountLink.toString());
    }
}

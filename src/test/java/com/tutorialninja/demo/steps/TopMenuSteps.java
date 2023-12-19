package com.tutorialninja.demo.steps;

import com.tutorialninja.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @And("I should navigate to desktop page")
    public void iShouldNavigateToDesktopPage() {
    }

    @Then("I should get desktop text ike {string}")
    public void iShouldGetDesktopTextIke(String desktopText) {
        Assert.assertEquals(new HomePage().verifyDesktopsText(), desktopText, "Incorrect Text");
    }

    @Then("I should get laptop and notebook text like {string}")
    public void iShouldGetLaptopAndNotebookTextLike(String laptopAndNotebookText) {
        Assert.assertEquals(new HomePage().verifyLaptopAndNoteText(), laptopAndNotebookText, "Incorrect Text");
    }

    @When("I click on Components tab")
    public void iClickOnComponentsTab() {
        new HomePage().clickOnComponents();
    }

    @And("I call selectMenu and pass all components {string}")
    public void iCallSelectMenuAndPassAllComponents(String allComponents) {
        new HomePage().selectMenu(allComponents);
    }

    @And("I should navigate to Components page")
    public void iShouldNavigateToComponentsPage() {
    }

    @Then("I should get components like {string}")
    public void iShouldGetComponentsLike(String componentsText) {
        Assert.assertEquals(new HomePage().verifyComponentsText(), componentsText, "Incorrect Text");
    }
}

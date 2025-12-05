package com.stepDefinitions;

import com.pages.CartPage;
import com.pages.InventoryPage;
import com.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.hooks.Hooks.page;

public class SauceDemoSteps {
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;

    @Given("user is on SauceDemo login page")
    public void userIsOnSauceDemoLoginPage() {
        loginPage = new LoginPage(page);
        inventoryPage = new InventoryPage(page);
        cartPage = new CartPage(page);

        loginPage.navigate();
    }

    @When("user logs in with valid credentials")
    public void userLogsInWithValidCredentials() {
        loginPage.login("standard_user", "secret_sauce");
    }

    @And("user adds the first product to cart")
    public void userAddsTheFirstProductToCart() {
        inventoryPage.buttonAddToCart();
    }

    @And("user opens the cart page")
    public void userOpensTheCartPage() {
        inventoryPage.buttonCart();
    }


    @And("user clicks checkout button")
    public void userClicksCheckoutButton() {
        cartPage.buttonCheckout();
    }


    @Then("user should be redirected to checkout page")
    public void userShouldBeRedirectedToCheckoutPage() {
        String header = page.locator("#header_container > div.header_secondary_container > span").innerText();
        Assert.assertEquals(header, "Checkout: Your Information", "Page header mismatch");
    }
}

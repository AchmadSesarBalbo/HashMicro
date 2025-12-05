package com.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class InventoryPage {
    private final Page page;

    private Locator buttonAddToCart;
    private Locator buttonCart;
    private Locator productLabel;

    public InventoryPage(Page page) {
        this.page = page;

        this.buttonAddToCart = page.getByRole(AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName("Add to cart"));

        this.buttonCart = page.locator("#shopping_cart_container > a");
    }

    public void buttonAddToCart() {
        buttonAddToCart.nth(0).click();
    }

    public void buttonCart() {
        buttonCart.click();
    }
}

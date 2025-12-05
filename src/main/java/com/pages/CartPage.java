package com.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class CartPage {
    private final Page page;

    private Locator buttonCheckout;

    public CartPage(Page page) {
        this.page = page;

        this.buttonCheckout = page.getByRole(AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName("Checkout"));

    }

    public void buttonCheckout() {
        buttonCheckout.click();
    }
}

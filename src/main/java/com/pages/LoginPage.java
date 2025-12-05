package com.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {
    private final Page page;

    private Locator usernameInput;
    private Locator passwordInput;
    private Locator buttonLogin;

    public LoginPage (Page page) {
        this.page = page;

        this.usernameInput = page.locator("#user-name");
        this.passwordInput = page.locator("#password");
        this.buttonLogin = page.locator("#login-button");
    }

    public void navigate() {
        page.navigate("https://www.saucedemo.com/");
    }

    public void login(String username, String password) {
        usernameInput.fill(username);
        passwordInput.fill(password);
        buttonLogin.click();
    }
}

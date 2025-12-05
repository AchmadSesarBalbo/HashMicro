package com.hooks;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.*;
import io.qameta.allure.Allure;

import java.io.ByteArrayInputStream;

public class Hooks {
    public static Playwright playwright;
    public static Browser browser;
    public static Page page;

    @Before
    public void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

        page = browser.newPage();
    }

    @After
    public void teardown(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = page.screenshot(new Page.ScreenshotOptions().setFullPage(true));

            scenario.attach(screenshot, "image/png", "Failure Screenshot");

            Allure.addAttachment("Failed Screenshot",
                    new ByteArrayInputStream(screenshot));
        }

        browser.close();
        playwright.close();
    }
}

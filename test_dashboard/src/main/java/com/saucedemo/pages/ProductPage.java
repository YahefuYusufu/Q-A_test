package com.saucedemo.pages;

import base.BasePage;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    private final By productsHeader = By.xpath("//span[text()='Products']");

    public boolean isProductsHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }
}

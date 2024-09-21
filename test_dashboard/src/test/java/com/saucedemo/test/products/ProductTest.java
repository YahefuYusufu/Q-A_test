package com.saucedemo.test.products;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductPage;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class ProductTest extends BaseTest {


    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductPage productPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productPage.isProductsHeaderDisplayed(), "\n Products Header Is Not Displayed \n");
    }
}

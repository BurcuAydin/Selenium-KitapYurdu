package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.*;
import org.junit.Test;

public class MainTest extends BaseTest {
    @Test
    public void mainTest() {
        HomePage homePage = new HomePage();
        homePage.home();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.searchProduct();
        productPage.scrollAndAddFavorite();
        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.point();
        pointCatalogPage.goToFavorites();
        CartPage cartPage = new CartPage();
        cartPage.goCart();
        cartPage.increaseProductNum("3");
        cartPage.addAddress();
        cartPage.payment();
    }

}
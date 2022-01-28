package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import com.testinium.page.CartPage;
import com.testinium.page.LoginPage;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void cartTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        CartPage cartPage = new CartPage();
        cartPage.goCart();
        cartPage.increaseProductNum("3");
        cartPage.addAddress();
        cartPage.payment();
        cartPage.logout();
    }
}

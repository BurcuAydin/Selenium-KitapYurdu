package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}

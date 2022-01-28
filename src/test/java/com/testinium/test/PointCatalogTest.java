package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.LoginPage;
import com.testinium.page.PointCatalogPage;
import org.junit.Test;

public class PointCatalogTest extends BaseTest {

    @Test
    public void pointTest() {
        //LoginPage loginPage = new LoginPage();
        //loginPage.login();
        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.point();
        pointCatalogPage.goToFavorites();

    }
}

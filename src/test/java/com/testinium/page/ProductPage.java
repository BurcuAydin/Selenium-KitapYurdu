package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public ProductPage() {
        methods = new Methods();
    }

    public void searchProduct() {
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(5);


    }

    public void scrollAndAddFavorite() {
        methods.scrollWithAction(By.xpath("//div[@id='product-532576']"));
        methods.waitBySeconds(5);
        for (int i = 1; i < 5; i++) {
            methods.selectRandomProduct(By.xpath("//a[@class='add-to-favorites']"));
            methods.waitBySeconds(1);
        }
        methods.click(By.xpath("//div[@class='logo-text']"));
    }

}

package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class CartPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public CartPage() {

        methods = new Methods();
    }
    public void goCart() {
        methods.click(By.xpath("//h4[@class='common-sprite']"));
        methods.waitBySeconds(3);
        methods.click(By.id("js-cart"));
    }
    public void increaseProductNum(String num){
        methods.clear(By.xpath("//input[@name='quantity']"));
        methods.sendKeys(By.xpath("//input[@name='quantity']"),num);
        methods.click(By.xpath("//i[@class='fa fa-refresh green-icon']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='right']"));
        methods.waitBySeconds(3);

    }
    public void addAddress(){
        methods.click(By.xpath("//a[@href='#tab-shipping-new-adress']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.cssSelector("#address-firstname-companyname"),"Burcu");
        methods.sendKeys(By.cssSelector(("#address-lastname-title")),"Aydın");
        methods.selectByText(By.cssSelector("#address-country-id"),"Türkiye");
        methods.selectByText(By.cssSelector("#address-zone-id"),"İstanbul");
        methods.waitBySeconds(2);
        methods.selectByText(By.cssSelector("#address-county-id"), "MALTEPE");
        methods.sendKeys(By.cssSelector("#address-address-text"),"adres deneme");
        methods.sendKeys(By.cssSelector("#address-telephone"),"2162222222");
        methods.sendKeys(By.cssSelector("#address-mobile-telephone"),"5065555555");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#button-checkout-continue"));
        methods.waitBySeconds(5);
    }
    public void payment(){
        methods.click(By.cssSelector("#button-checkout-continue"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.cssSelector("#credit-card-owner"),"Burcu Aydın");
        methods.sendKeys(By.cssSelector("#credit_card_number_1"),"1234");
        methods.sendKeys(By.cssSelector("#credit_card_number_2"),"1234");
        methods.sendKeys(By.cssSelector("#credit_card_number_3"),"1234");
        methods.sendKeys(By.cssSelector("#credit_card_number_4"),"1234");
        methods.selectByText(By.cssSelector("#credit-card-expire-date-month"),"03");
        methods.selectByText(By.cssSelector("#credit-card-expire-date-year"),"2022");
        methods.sendKeys(By.cssSelector("#credit-card-security-code"),"000");
        methods.click(By.cssSelector("#button-checkout-continue"));
        methods.waitBySeconds(5);
        methods.isElementVisible(By.xpath("//span[@class='error']"));
        methods.waitBySeconds(3);

    }
    public void logout(){
        methods.click(By.xpath("//img[@title='kitapyurdu.com']"));
        methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector("common-sprite"), "Çıkış");
    }
}

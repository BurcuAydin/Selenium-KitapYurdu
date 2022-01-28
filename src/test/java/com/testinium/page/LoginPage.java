package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {


    Methods methods;

    public LoginPage() {

        methods = new Methods();
    }

    public void login() {
        methods.click(By.xpath("//a[contains(text(),'Giriş Yap')]"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"), "aydinburcu63@gmail.com");

        methods.sendKeys(By.id("login-password"), "1q2w3e4r5t");
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(10);
       // methods.isElementVisible(By.xpath("//a[@class='common-sprite']"));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//h1[contains(text(),'Hesabım')]")));
    }
}

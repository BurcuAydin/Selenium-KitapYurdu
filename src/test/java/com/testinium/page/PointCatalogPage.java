package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class PointCatalogPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public PointCatalogPage(){

        methods = new Methods();
    }
    public void point(){
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.selectByText(By.xpath("//div[@class='sort']/select"),"Yüksek Oylama");
        methods.waitBySeconds(3);
        methods.hover(By.xpath("//*[@class=\"mn-strong common-sprite\" and contains(text(),'Tüm Kitaplar')]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@class='mn-icon icon-angleRight' and contains(text(),'Hobi')]"));
        methods.waitBySeconds(6);
        methods.selectRandomProduct(By.xpath("//div[@class='name ellipsis']"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//a[@class='add-to-cart btn-orange btn-ripple']"));
        methods.waitBySeconds(3);

    }
    public void goToFavorites(){
        methods.hover(By.xpath("//div[@class='menu top my-list']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
        methods.waitBySeconds(3);
    }

}

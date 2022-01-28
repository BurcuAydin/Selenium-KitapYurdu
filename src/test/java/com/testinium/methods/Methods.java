package com.testinium.methods;

import com.testinium.driver.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;

    public Methods() {
        driver = BaseTest.driver;
        wait = new FluentWait<WebDriver>(driver);
        //Ne kadar sürede arasın max? Ne kadar sürede bir arasın?
        wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(300)).ignoring(NoSuchElementException.class);
    }

    public WebElement findElement(By by) {

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by) {
        findElement(by).click();

    }

    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void scrollWithAction(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void addFavorites(By by) {

        Random random = new Random();
        List<WebElement> fav = findElements(By.cssSelector(".add-to-favorites"));
        int index = random.nextInt(fav.size());
        {

        }
    }

    private List<WebElement> findElements(By by) {
        return (List<WebElement>) wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public Select getSelect(By by) {

        return new Select(findElement(by));
    }

    public void selectByText(By by, String text) {

        getSelect(by).selectByVisibleText(text);
    }

    public void hover(By by) {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(by);
        action.moveToElement(we).build().perform();
    }

    public void selectRandomProduct(By by) {
        Random rnd = new Random();
        List<WebElement> books = driver.findElements(by);
        int randomBook = rnd.nextInt(books.size());
        books.get(randomBook).click();
    }
    public void clear(By by) {
        findElement(by).clear();
    }

    }






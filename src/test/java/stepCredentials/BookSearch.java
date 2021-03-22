package stepCredentials;

import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class BookSearch {

    WebDriver driver;

    public BookSearch(WebDriver driver) {
        this.driver = driver;
        WebElement searchBar = driver.findElement(By.cssSelector("div.search-bar:nth-child(2) > div:nth-child(1) > input:nth-child(2)"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("document.querySelector('div.search-bar:nth-child(2) > div:nth-child(1) > input:nth-child(2)').removeAttribute('data-val-regex-pattern');", searchBar);
        searchBar.sendKeys("odrodzone królestwo");
        searchBar.sendKeys(Keys.RETURN);
        //WIP - text dissapearing as soon as it is typed
    }

}

package loginCredentials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstLogin {

    WebDriver driver;

    public FirstLogin(WebDriver driver) {
        this.driver = driver;
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("tyronda62@asurfacesz.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("testpassword123");
    }

}

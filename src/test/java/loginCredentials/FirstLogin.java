package loginCredentials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FirstLogin {

    WebDriver driver;

    public FirstLogin(WebDriver driver) {
        this.driver = driver;
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("tyronda62@asurfacesz.com");
        // enter login here
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("testpassword123");
        // enter password here; not secured
        driver.findElement(By.cssSelector("a.btn:nth-child(3) > span:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")).click();
        // login button click
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

}

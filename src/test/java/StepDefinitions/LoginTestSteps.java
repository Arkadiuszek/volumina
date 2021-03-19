package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import loginCredentials.FirstLogin;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Highlighter;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class LoginTestSteps {

    public static final Object URL = "https://www.publio.pl/index.html";
    WebDriver driver = null;

    public void loginPage(){

    }
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to("https://www.publio.pl");
        WebElement zalogujSie = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[3]/a[1]/span"));
        zalogujSie.click();
    }

    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() {
         FirstLogin firstLogin = new FirstLogin(driver);
    }

    @And("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.cssSelector("a.btn:nth-child(3) > span:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("user is logged in and home page appears")
    public void user_is_logged_in_and_home_page_appears() {
        String userName = driver.findElement(By.className("link-box")).getText();
        Assert.assertEquals(URL, "https://www.publio.pl/index.html");
    }

}

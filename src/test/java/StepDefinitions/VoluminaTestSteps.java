package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import loginCredentials.FirstLogin;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Highlighter;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class VoluminaTestSteps {

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

    @When("user logs in")
    public void user_logs_in() {FirstLogin firstLogin = new FirstLogin(driver);}


    @And("user search for some books")
    public void user_search_for_some_books() {

    }

    @And("user adds books in cart")
    public void user_adds_books_in_cart() {

    }

    @Then("user goes to cart")
    public void user_goes_to_cart() {

    }

}

package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {
    WebDriver driver;
    @Given("open web url {string}")
    public void openWebUrl(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }


    @Then("Should succes login and redirected to homepage")
    public void shouldSuccesLoginAndRedirectedToHomepage() {
        Assert.assertTrue(driver.findElement(By.id("inventory_container")).isDisplayed());
        driver.close();
        driver.quit();
    }
    @Then("Failed login and showing message")
    public void failedLoginAndShowingMessage() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='error-message-container error']")).isDisplayed());
        driver.close();
        driver.quit();

    }
}

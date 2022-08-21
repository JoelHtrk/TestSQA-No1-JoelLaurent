import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    @Given("User open browser")
    public void userOpenBrowser() {
        System.out.println("Step - User open browser");

        WebDriver driver;
        @Given("open web url {string}")
        public void openWebUrl(String url) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
    }

    @And("User on tokopedia homepage")
    public void userOnTokopediaHomepage() {
            System.out.println("Step - User on tokopedia home");

            //tokped homepage
            driver.get("https://www.tokopedia.com/");
        }
    }

    @When("User search handphone on search box")
    public void userSearchHandphoneOnSearchBox() {
        System.out.println("Step - user search handphone on search box");

        //searching handphone on search box
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/form/div/div/input")).sendKeys("handphone");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/form/div/div/input")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("User navigated to handphone result page")
    public void userNavigatedToHandphoneResultPage() {
        System.out.println("Step - user navigated to handphone result page");

        //handphone result page
        driver.getPageSource().contains("handphone samsung");

        //close browser
        driver.close();
        driver.quit();
    }
}

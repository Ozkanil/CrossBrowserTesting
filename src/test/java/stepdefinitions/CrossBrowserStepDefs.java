package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.ConfigurationReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CrossBrowserStepDefs {

    WebDriver driver;

    @Given("user is on the application_url with chrome")
    public void user_is_on_the_application_url_with_chrome() throws MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://localhost:4444/"),new ChromeOptions());

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get(ConfigurationReader.getProperty("url"));

    }
    @Then("user quits remote driver")
    public void user_quits_remote_driver() {


        driver.quit();

    }

    @Given("user is on the application_url with firefox")
    public void userIsOnTheApplication_urlWithFirefox() throws MalformedURLException {


        driver = new RemoteWebDriver(new URL("http://localhost:4444/"),new FirefoxOptions());

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get(ConfigurationReader.getProperty("url"));

    }
}

//SeleniumServer % java -jar selenium-server-4.1.2.jar standalone
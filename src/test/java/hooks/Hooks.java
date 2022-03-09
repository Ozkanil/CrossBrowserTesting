package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Hooks {



    @Before(value = "@plant_calculator")
    public void navigateToRegistrationPage(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @After(value = "@plant_calculator")
    public void tearDown(Scenario scenario) throws IOException {

        if (scenario.isFailed()) {

            ReusableMethods.getScreenshot("fail");
        }

    }}

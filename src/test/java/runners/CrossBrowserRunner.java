package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "rerun:target/failedRerun.txt"},

        features = "./src/test/resources/features",
        glue = {"stepdefinitions"},
        tags = "@plant_calculator_cross",
        dryRun = false
)
public class CrossBrowserRunner {


}

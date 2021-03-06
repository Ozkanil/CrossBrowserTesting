package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports.html"},

        features = "@target/failedRerun.txt",
        glue = "stepdefinitions",
        dryRun = false
)

public class FailedScenarioRunner {
}

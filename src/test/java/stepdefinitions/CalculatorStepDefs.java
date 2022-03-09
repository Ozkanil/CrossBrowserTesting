package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.CalculatorPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CalculatorStepDefs {

    String number;
    int type;

    CalculatorPage calculatorPage=new CalculatorPage();


    @Given("user clicks click me button and then clicks now click me button")
    public void user_clicks_click_me_button_and_then_clicks_now_click_me_button() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        calculatorPage.clickmeButton.click();
        calculatorPage.nowClickmeButton.click();

    }
    @Then("user verifies that tree plant calculator page is opened")
    public void user_verifies_that_tree_plant_calculator_page_is_opened() {

        Assert.assertTrue(calculatorPage.titleText.isDisplayed());

    }

    @Then("user enters the number of seeds planted {string}")
    public void user_enters_the_number_of_seeds_planted(String seedNumber) {

        number=seedNumber;
        calculatorPage.seedsNumberBox.sendKeys(number);

    }
    @Then("user enters name {string}")
    public void user_enters_name(String name) {

        calculatorPage.nameBox.sendKeys(name);

    }
    @Then("user enters the time of plant hour {string} and minute {string}")
    public void user_enters_the_time_of_plant_hour_and_minute(String hour, String minute) throws InterruptedException {

        calculatorPage.timeBox.sendKeys(hour);

        Driver.waitForVisibility(calculatorPage.timeBox,5).sendKeys(minute);

    }

    @And("user selects tree type {string}")
    public void userSelectsTreeType(String treeType) {

        type=Integer.parseInt(treeType);
        new Select(calculatorPage.treeTypeBox).selectByIndex(type);

    }

    @Then("user clicks submit button")
    public void user_clicks_submit_button() {

        Driver.waitAndClick(calculatorPage.submitButton);

    }
    @Then("user verifies that the result is visible and correct")
    public void user_verifies_that_the_result_is_visible_and_correct() {

        double calcResult= Double.parseDouble(calculatorPage.calculationResult.getText().toString());
        double numberOfSeeds= Double.parseDouble(number);


        Assert.assertTrue(((numberOfSeeds/10)*type)== calcResult);

    }

    @And("user clicks alternative calculator button")
    public void userClicksAlternativeCalculatorButton() {

        calculatorPage.alternativeMethodCheckbox.click();
    }

    @Then("user verifies that the alternative calculation result is visible and correct")
    public void userVerifiesThatTheAlternativeCalculationResultIsVisibleAndCorrect() {

        double calcResult= Double.parseDouble(calculatorPage.calculationResult.getText().toString());
        double numberOfSeeds= Double.parseDouble(number);

        Assert.assertTrue(((numberOfSeeds/5)*type)== calcResult);

    }

    @Then("user verifies that error messages are visible")
    public void userVerifiesThatErrorMessagesAreVisible() {

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(calculatorPage.seedNumberVerificationText.isDisplayed());
        softAssert.assertTrue(calculatorPage.nameVerificationText.isDisplayed());
        softAssert.assertTrue(calculatorPage.timeVerificationText.isDisplayed());
        softAssert.assertTrue(calculatorPage.treeTypeVerificationText.isDisplayed());
        softAssert.assertAll("Steps failed");

    }
}

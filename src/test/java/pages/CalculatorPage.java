package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CalculatorPage {

    public CalculatorPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="first")
    public WebElement clickmeButton;

    @FindBy(id="second")
    public WebElement nowClickmeButton;

    @FindBy(className = "title")
    public WebElement titleText;

    @FindBy(name= "seeds")
    public WebElement seedsNumberBox;

    @FindBy(name="name")
    public WebElement nameBox;

    @FindBy(name="time")
    public WebElement timeBox;

    @FindBy(name="type")
    public WebElement treeTypeBox;

    @FindBy(name="method")
    public WebElement alternativeMethodCheckbox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "(//li)[1]")
    public WebElement seedNumberVerificationText;

    @FindBy(xpath = "(//li)[2]")
    public WebElement nameVerificationText;

    @FindBy(xpath = "(//li)[3]")
    public WebElement timeVerificationText;

    @FindBy(xpath = "(//li)[4]")
    public WebElement treeTypeVerificationText;

    @FindBy(id = "result")
    public WebElement calculationResult;


}

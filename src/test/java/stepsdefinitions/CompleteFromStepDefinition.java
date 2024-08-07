package stepsdefinitions;

import driver.GoogleChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import steps.HomeStep;

public class CompleteFromStepDefinition {

    HomeStep hs = new HomeStep();

    @After
    public void tearDown(){
        GoogleChromeDriver.quitBrowser();
    }

    @Given("the user enter the home page")
    public void theUserEnterTheHomePage() throws InterruptedException {
        GoogleChromeDriver.ChromeDriver("https://artoftesting.com/samplesiteforselenium");
        Thread.sleep(2000);

    }

    @When("the user enther the txtbox")
    public void theUserEntherTheTxtbox() throws InterruptedException {
     hs.enterTex();
     Thread.sleep(2000);
    }

    @When("the user click in the button")
    public void theUserClickInTheButton() throws InterruptedException {
     hs.clickBtn();
     Thread.sleep(2000);
    }

    @When("the user double click in the second button")
    public void theUserDoubleClickInTheSecondButton() {
        hs.doubleClick();
    }

    @When("the user select radio button")
    public void theUserSelectRadioButton() {

    }

    @When("the user select checkbox")
    public void theUserSelectCheckbox() {

    }

    @When("the user select dropdown")
    public void theUserSelectDropdown() {

    }

    @When("the user generate alert")
    public void theUserGenerateAlert() {

    }

    @When("the user generate confirm alert")
    public void theUserGenerateConfirmAlert() {

    }

    @Then("the user finish process")
    public void theUserFinishProcess() {

    }


}

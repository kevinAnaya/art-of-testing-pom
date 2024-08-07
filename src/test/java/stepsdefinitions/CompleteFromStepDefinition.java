package stepsdefinitions;

import driver.GoogleChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompleteFromStepDefinition {


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
    public void theUserEntherTheTxtbox() {

    }

    @When("the user click in the button")
    public void theUserClickInTheButton() {

    }

    @When("the user double click in the second button")
    public void theUserDoubleClickInTheSecondButton() {

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

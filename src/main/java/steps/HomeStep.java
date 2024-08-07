package steps;

import driver.GoogleChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;

public class HomeStep {
    HomePage hp = new HomePage();


    public void enterTex(){
        GoogleChromeDriver.driver.findElement(hp.getTXTBOX()).sendKeys("pruebas");
    }

    public void clickBtn(){
        GoogleChromeDriver.driver.findElement(hp.getBTN()).click();
    }

    public void doubleClick(){
        GoogleChromeDriver.driver.findElement(hp.getBTNDBLCLICK()).click();
    }
}

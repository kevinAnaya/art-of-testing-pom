package pages;

import driver.GoogleChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    By TXTBOX = By.xpath("//input[@id='fname']");
    By BTN  = By.xpath("//button[@id='idOfButton']");
    By BTNDBLCLICK = By.xpath("//button[@id='dblClkBtn']");
    By RDBMALE = By.xpath("//input[@id='male']");

    public By getTXTBOX() {
        return TXTBOX;
    }

    public By getBTN() {
        return BTN;
    }

    public By getBTNDBLCLICK() {
        return BTNDBLCLICK;
    }

    public By getRDBMALE() {
        return RDBMALE;
    }
}

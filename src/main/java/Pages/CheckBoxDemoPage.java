package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckBoxDemoPage {

    private WebDriver driver;
    private By singleCheckBox = By.xpath(".//label[text() = 'Click on check box'] /input[@type='checkbox']");
    private By resultText = By.xpath(".//p[text()='Checked!']");

    public CheckBoxDemoPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSingleCheckBox(){
        driver.findElement(singleCheckBox).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeSelected(singleCheckBox));
    }
    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavascriptAlertsPage {
    private WebDriver driver;

    private By alertButton = By.className("btn btn-dark my-30 mx-10 hover:bg-lambda-900 hover:border-lambda-900");


    public JavascriptAlertsPage(WebDriver driver){
      this. driver = driver;
    }

    public void clickAlertButton(){
        driver.findElement(alertButton).click();
    }
    public String displayText(){
       return driver.switchTo().alert().getText();
    }
    public void alert_Accepted(){
        driver.switchTo().alert().accept();
    }


}

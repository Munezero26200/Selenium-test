package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private  WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    public LoginPage clickLoginPage(){
        clickLink("Login");
        return new LoginPage(driver);
    }
    public JavascriptAlertsPage clickJavascriptAlertsPage (){
        clickLink ("Javascript Alerts");
        return new JavascriptAlertsPage(driver);
    }
    public ContextMenuPage clickContextMenuPage(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public DropdownPlatformPage clickDropdownPlatform(){
        clickLink("Platform");
        return new DropdownPlatformPage(driver);
    }
    public CheckBoxDemoPage clickCheckBoxDemoPage() {
        clickLink("Checkbox Demo");
        return new CheckBoxDemoPage(driver);
    }
}

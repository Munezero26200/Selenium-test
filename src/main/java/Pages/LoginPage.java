package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.awt.SystemColor.text;

public class LoginPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginBtn = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public String enterCredentials(String myEmail, String myPassword){
        driver.findElement(emailField).sendKeys(myEmail);
        driver.findElement(passwordField).sendKeys(myPassword);
         clickLoginButton();

    }
    public void clickLoginButton(){
         driver.findElement(loginBtn).click();
    }




}

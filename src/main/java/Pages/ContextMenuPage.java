package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By Box = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickBox(){
        WebElement hotSpotElement = driver.findElement(Box);
        Actions actions = new Actions(driver);
        actions.contextClick(hotSpotElement).perform();
    }
    public void alert_clickOk(){
        driver.switchTo().alert().accept();
    }



}

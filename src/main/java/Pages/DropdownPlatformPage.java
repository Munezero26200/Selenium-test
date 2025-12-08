package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPlatformPage {
    private WebDriver driver;
    private By dropdown = By.linkText("Platform");

    public  DropdownPlatformPage(WebDriver driver){
        this.driver = driver;
    }
    public void selectFromDropdown(String option) {
        WebElement dropdownElement = driver.findElement(dropdown);
        Select selectOption = new Select(dropdownElement);
        selectOption.selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        WebElement dropdownElement = driver.findElement(dropdown);
        Select select = new Select(dropdownElement);
        new Select(dropdownElement);

        List<WebElement> selectedElements = select.getAllSelectedOptions();

        List<String> SelectedTexts = new ArrayList<>();
        for(WebElement el: selectedElements){
            SelectedTexts.add(el.getText());
        }
        return SelectedTexts;
    }
}

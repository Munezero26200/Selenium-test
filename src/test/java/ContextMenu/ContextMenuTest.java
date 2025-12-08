package ContextMenu;

import Tests.BaseTests;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTests {
    @Test
    public void clickOkOnModalMessage(){
        var entrancePage = homePage.clickContextMenuPage();
         entrancePage.clickBox();
         entrancePage.alert_clickOk();

    }
}

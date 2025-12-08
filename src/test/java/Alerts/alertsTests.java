package Alerts;

import Tests.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class alertsTests extends BaseTests {
    @Test
    public void testAlertAccepted(){
        var entrancePage = homePage.clickJavascriptAlertsPage();
        entrancePage.clickAlertButton();
        var alertText = entrancePage.displayText();
        entrancePage.alert_Accepted();
        assertTrue(alertText.contains("I am an alert box!"),"fail");

    }
}

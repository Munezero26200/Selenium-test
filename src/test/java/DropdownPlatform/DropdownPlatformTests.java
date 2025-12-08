package DropdownPlatform;

import Tests.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class DropdownPlatformTests extends BaseTests {
    @Test
    public void testSelectDropdownOption(){
        var entrancePage = homePage.clickDropdownPlatform();
        entrancePage.selectFromDropdown("KaneAI - GenAI-Native Testing Agent");
        List<String> selectedOptions = entrancePage.getSelectedOptions();
        assertTrue(selectedOptions.contains("KaneAI - GenAI-Native Testing Agent"));

    }
}

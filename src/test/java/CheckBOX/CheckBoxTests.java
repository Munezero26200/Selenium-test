package CheckBOX;

import Tests.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CheckBoxTests extends BaseTests {
    @Test
    public void testsingleCheckBox(){
        var entrancePage = homePage.clickCheckBoxDemoPage();
        entrancePage.clickSingleCheckBox();
        String result = entrancePage.getResultText();
        assertEquals(result, "Checked!","fail");

    }
}

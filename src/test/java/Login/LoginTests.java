package Login;

import Tests.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testLoginPage(){
        String myEmail = "alinemunezero920@gmail.com";
        String myPassword = "aline123@34";
         var entrancePage = homePage.clickLoginPage();
         var fillLoginPage = entrancePage.enterCredentials(myEmail,myPassword);

         assertTrue(fillLoginPage.contains(""),"fail");

    }
}

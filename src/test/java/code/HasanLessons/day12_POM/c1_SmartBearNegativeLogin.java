package code.HasanLessons.day12_POM;

import code.HasanLessons.Base.TestBase2;
import code.HasanLessons.pages.SmartBearLoginPage;
import code.HasanLessons.utilities.BrowserUtils;
import code.HasanLessons.utilities.DriverUtil;
import code.HasanLessons.utilities.PropertiesReadingUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c1_SmartBearNegativeLogin extends TestBase2 {
    @Test
    public void TC1_NegativeTest(){

        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage();
        BrowserUtils.staticWait(5);
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("invalidUser"),PropertiesReadingUtil.getProperties("InvalidPassword"));

        //verify that we get error message
        String actualErrorMessage=smartBearLoginPage.getStatusMessage();
        String expectedErrorMessage="Invalid Login or Password.";
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage,"assertion failed, user was able login!!");

    }

}



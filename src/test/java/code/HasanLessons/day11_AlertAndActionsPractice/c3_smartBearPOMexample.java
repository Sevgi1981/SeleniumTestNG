package code.HasanLessons.day11_AlertAndActionsPractice;

import code.HasanLessons.Base.TestBase;
import code.HasanLessons.Base.TestBase2;
import code.HasanLessons.pages.SmartBearLoginPage;
import code.HasanLessons.utilities.DriverUtil;
import code.HasanLessons.utilities.PropertiesReadingUtil;
import org.testng.annotations.Test;

public class c3_smartBearPOMexample extends TestBase2 {

    @Test
    public void TC1(){

        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage(); // create an object/instance

        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),
                PropertiesReadingUtil.getProperties("SmartBear_password"));



    }
}

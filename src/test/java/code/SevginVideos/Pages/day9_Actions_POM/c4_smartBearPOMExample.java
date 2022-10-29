package code.SevginVideos.Pages.day9_Actions_POM;

import code.SevginVideos.Pages.SmartBearLoginPage;
import code.SevginVideos.base.TestBase2;
import code.SevginVideos.base.utilities.DriverUtil;
import code.SevginVideos.base.utilities.PropertiesReadingUtil;
import org.testng.annotations.Test;
public class c4_smartBearPOMExample extends TestBase2 {

    //to be able to work with page you need create an instance from page
    //so you can have access to methods and webelements
    SmartBearLoginPage smartBearLoginPage;

    @Test
    public void TC1_smartBearPossitiveLoginVerification(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));

        smartBearLoginPage = new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),
                PropertiesReadingUtil.getProperties("SmartBear_password"));


    }
}
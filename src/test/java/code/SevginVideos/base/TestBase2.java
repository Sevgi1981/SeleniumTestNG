package code.SevginVideos.base;

import code.SevginVideos.base.utilities.DriverUtil;
import code.SevginVideos.base.utilities.BrowserUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase2 {  //abstracction example


    @BeforeMethod
    public void SetUp(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closing(){
        BrowserUtils.wait(2);
        DriverUtil.closeDriver();
    }

}

package code.HasanLessons.Base;

import code.HasanLessons.utilities.DriverUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase2 {

    //abstraction example
    @BeforeMethod
    public void setUp(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void Closing(){
        // BrowserUtils.staticWait(10);
        // DriverUtil.closingDriver();
    }


}

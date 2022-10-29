package code.HasanLessons.Base;

import code.HasanLessons.utilities.BrowserUtils;
import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;


    @BeforeMethod
    public void setUp(){
    driver= WebDriverUtil.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void closing(){
        BrowserUtils.staticWait(3);
        //driver.close();
    }


}

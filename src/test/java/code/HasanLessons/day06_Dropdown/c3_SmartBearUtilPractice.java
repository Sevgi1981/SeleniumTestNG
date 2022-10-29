package code.HasanLessons.day06_Dropdown;

import code.HasanLessons.utilities.SmartBearLoginUtils;
import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c3_SmartBearUtilPractice {


    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Enter username --->Tester
    //4- Enter password --->test
    //5- Click "Login" button
    //6- Verify title equals: Web Orders

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //1- Open a chrome browser
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void TC1_loginSmartBearUtil(){
        SmartBearLoginUtils.loginForSmartBear(driver);
        //6- Verify title equals: Web Orders
        Assert.assertTrue(driver.getTitle().equals("Web Orders"));

    }
}

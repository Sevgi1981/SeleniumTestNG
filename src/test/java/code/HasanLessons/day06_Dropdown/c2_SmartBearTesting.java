package code.HasanLessons.day06_Dropdown;

import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c2_SmartBearTesting {

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

    @Test
    public void TC1_loginVerification() {

        WebElement userName= driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");

        WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement loginButton=driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        //6- Verify title equals: Web Orders
        String actualTitle=driver.getTitle();
        String expectedTitle= "Web Orders";
        Assert.assertEquals(expectedTitle, actualTitle, "failed");


    }

    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
}

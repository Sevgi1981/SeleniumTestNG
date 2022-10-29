package code.HasanLessons.day07_Webtable_Alerts;

import code.HasanLessons.utilities.SmartBearLoginUtils;
import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c3_WebTable {

    //    Smartbear software street verification
//       1. Open browser and login to Smartbear software
//       2. Click on View all orders
//       3. Verify Mark Smith has street as  “9, Maple Valley”
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearLoginUtils.loginForSmartBear(driver);
    }

    @Test
    public void TC1_VerifyMarkStreetName(){
        //       3. Verify Mark Smith has street as  “9, Maple Valley”
        // WebElement markStreet=driver.findElement(By.xpath("//td[.='9, Maple Valley']"));
        //parent to child
        WebElement markStreet=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/td[6]"));
        System.out.println("mark street is= "+ markStreet.getText());

        Assert.assertEquals(markStreet.getText(),"9, Maple Valley");

    }

}

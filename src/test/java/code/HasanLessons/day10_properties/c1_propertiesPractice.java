package code.HasanLessons.day10_properties;

import code.HasanLessons.Base.TestBase;
import code.HasanLessons.utilities.BrowserUtils;
import code.HasanLessons.utilities.PropertiesReadingUtil;
import code.HasanLessons.utilities.SmartBearLoginUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class c1_propertiesPractice extends TestBase {

//open chrome browser
//go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//click on box which belongs "charles Dodgeson"
//click on delete button
//verify if charles deleted from the list

    @Test
    public void TC1_CharlesDeleteVerification(){

        //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        //Login to Smartbear
        SmartBearLoginUtils.loginForSmartBear(driver);
        //click on box which belongs "charles Dodgeson"
        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector")).click();
        //click on delete button
        BrowserUtils.staticWait(3);
        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

        //verify if charles deleted from the list
        List<WebElement> listOfAllNames=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        for (WebElement eachName:listOfAllNames){
            Assert.assertFalse(eachName.getText().equals("Charles Dodgeson"),"Assertion failed");
        }

    }
}

package code.SevginVideos.day8_properties_JSexec;

import code.SevginVideos.base.TestBase;
import code.SevginVideos.base.utilities.PropertiesReadingUtil;
import code.SevginVideos.base.utilities.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

public class c1_SmartBearPractice extends TestBase {

    //open chrome browser
    //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //click on box which belongs "charles Dodgeson"
    //click on delete button
    //verify if charles deleted from the list

    @Test
    public void TC1_CharlersDeleteVerification(){
        //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearUtils.loginForSmartBear(driver);
        //click on box which belongs "charles Dodgeson"
        WebElement charlesCheckbox=driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
        charlesCheckbox.click();
        //click on delete button
        WebElement deleteButton=driver.findElement(By.className("btnDeleteSelected"));
        deleteButton.click();


        //verify if charles deleted from the list

        //after deleting the charles we will need to check all table and make sure charles is not in table anymore
        //first store all names
        List<WebElement> listOfNames=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        //verify charles is not there
        for (WebElement eachName:listOfNames){
            Assert.assertFalse(eachName.getText().equals("Charles Dodgeson") , "Charles is present in the table and verification failed");
        }


    }

}

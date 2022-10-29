package code.HasanLessons.day10_properties;

import code.HasanLessons.utilities.DriverUtil;
import code.HasanLessons.utilities.PropertiesReadingUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c3_driverUtilPractice {

    //go to google
    //search for java
    //verify title contains java

    @Test
    public void TC1(){

        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
        WebElement googleSearchBox=DriverUtil.getDriver().findElement(By.name("q"));
        //search Java

        String searchItem=PropertiesReadingUtil.getProperties("google_searchData");
        googleSearchBox.sendKeys(searchItem+Keys.ENTER);
        //verify title contains java
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(searchItem));

    }

}

package code.HasanLessons.day11_AlertAndActionsPractice;

import code.HasanLessons.Base.TestBase;
import code.HasanLessons.utilities.BrowserUtils;
import code.HasanLessons.utilities.DriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c1_alertPractice extends TestBase {

    /*
         Go to "http://the-internet.herokuapp.com/"
         click JavaScript Alerts
         Click for Js Prompt
         Enter "hello word" text
         Click okay
         Validate your text appearing on the page
         */

    @Test
    public void AlertPractice(){

       driver.get("http://the-internet.herokuapp.com/");
       //click JavaScript Alerts
       driver.findElement(By.xpath("//a[.='JavaScript Alerts']")).click();
       //Click for Js Prompt
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        //Enter "hello word" text
        Alert alert=driver.switchTo().alert();
        BrowserUtils.staticWait(5);
        String word="Hello World";
        alert.sendKeys(word);
        BrowserUtils.staticWait(5);
        alert.accept();

        WebElement actualText=driver.findElement(By.id("result"));
        Assert.assertTrue(actualText.getText().contains("Hello World"));



    }


}

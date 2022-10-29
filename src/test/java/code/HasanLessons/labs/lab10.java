package code.HasanLessons.labs;

import code.HasanLessons.Base.TestBase;
import code.HasanLessons.utilities.PropertiesReadingUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


//Prerequisites= Create username and password for guru99
//navigate to http://demo.guru99.com/V4/
//Login to Guru99 with username and password
//Use JavaScript executer to click on login
//Verify that you login to page

public class lab10 extends TestBase {

    @Test
    public void Login(){

        //Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //navigate to http://demo.guru99.com/V4/
        driver.get("http://demo.guru99.com/V4/");

        //Login to Guru99 with username and password
        driver.findElement(By.name("uid")).sendKeys(PropertiesReadingUtil.getProperties("Guru_UserName"));
        driver.findElement(By.name("password")).sendKeys(PropertiesReadingUtil.getProperties("Guru_Password"));

        //Use JavaScript executor to click on login
        WebElement button =driver.findElement(By.name("btnLogin"));
        //String click="arguments[0].click();";
        js.executeScript("arguments[0].click();", button);

        //Verify that you login to page
        System.out.println("driver.getTitle() = " + driver.getTitle());


    }
}





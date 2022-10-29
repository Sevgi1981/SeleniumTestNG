package code.HasanLessons.day05_TestNG;

import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c4_GoogleTestNG {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //go to google home page
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }
    //Verify google title
    //Search for redwine
    @Test
    public void TC1_GoogleTitleVerification(){
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("redwine",Keys.ENTER);

        //Verify that Title contains wine
        String actualTitle=driver.getTitle();
        String expectedTitle="wine";
        boolean myBoolean=actualTitle.contains(expectedTitle);
        //message in assertion will print out only if assertion fails
        Assert.assertTrue(myBoolean,"assertion is failed,title does not contain wine");

    }

    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(2000);
       // driver.close();

    }



}

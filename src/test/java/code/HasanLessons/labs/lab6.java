package code.HasanLessons.labs;

import code.HasanLessons.utilities.WebDriverUtil;
import code.HasanLessons.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab6 {

    //go to http://demo.guru99.com/test/newtours/register.php
    // click on country dropdown and select Barbados with Select Method
    // Use 3 different Select Method (visible text,index,value)
    // and switch to another countries as you wish

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");


    }

    @AfterMethod
    public void closing(){
        BrowserUtils.staticWait(5);
        driver.close();
    }

    @Test
    public void Barbados(){

        // click on country dropdown and select Barbados with Select Method
        WebElement DropDownBox=driver.findElement(By.xpath("//select[@name='country']"));
        DropDownBox.click();

        Select dropdown= new Select(DropDownBox);

        // dropdown.selectByVisibleText("BARBADOS");
        // dropdown.selectByValue("BARBADOS");

        dropdown.selectByIndex(19);
        BrowserUtils.staticWait(3);

        // and switch to another countries as you wish

        dropdown.selectByIndex(12); // AUSTRALIA
        BrowserUtils.staticWait(3);


    }
}

package code.HasanLessons.labs;

import code.HasanLessons.utilities.BrowserUtils;
import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab8 {

    //1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
    // Step 2) Enter Any Customer id.
    // Step 3) After entering the customer ID, Click on the “Submit” button.
    // Step 4) Reject/accept the alert.

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");


    }

    @Test
    public void TC1_alert(){
        // Step 2) Enter Any Customer id.
        WebElement customerID= driver.findElement(By.xpath("//input[@type='text']"));
        customerID.sendKeys("123456");
        BrowserUtils.staticWait(3);
        // Step 3) After entering the customer ID, Click on the “Submit” button.
        WebElement submitButton=driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();
        // Step 4) Reject/accept the alert.
        Alert alert=driver.switchTo().alert();
        BrowserUtils.staticWait(3);
        //alert.dismiss();
        alert.accept();

        String alertMessage=alert.getText();
        Assert.assertTrue(alertMessage.contains("Customer Successfully Delete!"));
        BrowserUtils.staticWait(3);
        alert.accept();


    }

}

package code.StudyHall;

import code.HasanLessons.utilities.WebDriverUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class day07_Alert_Practice {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        System.out.println("Before method is running");
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/delete_customer.php");

    }
    @AfterMethod
    public void closing(){

        System.out.println("After method is running");
        //  driver.close();
    }

    @Test
    public void TC_1_AlertPractice(){
        Faker faker=new Faker();
        String random=faker.name().name();
        WebElement inputBox=driver.findElement(By.xpath("//input[@name='cusid']"));
        inputBox.sendKeys(random+ Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Alert alert=driver.switchTo().alert();
        alert.accept();

        String alertMessage=alert.getText();
        Assert.assertTrue(alertMessage.contains("1Customer Successfully Delete!"));

        alert.accept();

    }


}

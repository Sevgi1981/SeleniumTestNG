package code.HasanLessons.day07_Webtable_Alerts;

import code.HasanLessons.utilities.WebDriverUtil;
import code.HasanLessons.utilities.BrowserUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c2_Alerts {

    //1- Open a chrome browser
    //2- Go to:https://renas-practice.herokuapp.com/home
    //click on elements
    //locate the alert button to click it
    //click button
    //handle alert

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //1- Open a chrome browser
        //2- Go to:https://renas-practice.herokuapp.com/home
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://renas-practice.herokuapp.com/home");
    }

    @Test
    public void AlertPractice() throws InterruptedException {
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        //click on alertbox
        driver.findElement(By.id("Alert BoxI")).click();
        //click on first alert
        WebElement alertButton=driver.findElement(By.id("alert-demo"));
        alertButton.click();
        //handle alert, switch to alert
        Alert alert=driver.switchTo().alert();
        BrowserUtils.staticWait(3);
        alert.accept();
        alertButton.click();
        Thread.sleep(3000);
        alert.dismiss();

    }
}

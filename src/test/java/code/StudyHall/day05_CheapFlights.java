package code.StudyHall;

import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
Hi everyone, This was Practice we worked on, You can continue working on it as a homework.
//Go to cheapflights.ca
// Search for a ticket from YYZ / Toronto to SFO / San Francisco
 */
public class day05_CheapFlights {


    WebDriver driver;
    @BeforeMethod
    public void setup(){System.out.println("Before method is running"); }
    @AfterMethod
    public void closing(){
        System.out.println("After method is running");
    }
    @Test
    public void TC1_Verification(){
        //Go to cheapflights.ca
        // Search for a ticket from YYZ / Toronto to SFO / San Francisco
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.cheapflights.ca/");
        ////div[@aria-label='Flight origin input']
        // ==>>> this is second way of locating with xpath  (//div[@class='lNCO-inner'])[1]
        WebElement fromBox=driver.findElement(By.xpath("//input[@aria-label='Flight origin input']"));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //  fromBox.click();
        fromBox.sendKeys("YYZ");
    }



}

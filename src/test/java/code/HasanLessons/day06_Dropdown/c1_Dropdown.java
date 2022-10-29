package code.HasanLessons.day06_Dropdown;

import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_Dropdown {

    //task1
    //1. Open Chrome browser
    //2. Go to "http://the-internet.herokuapp.com/"
    //3 click on dropdown
    //confirm default selected dropdown is "Please select an option"

        WebDriver driver;
        @BeforeMethod
    public void setUp() {
            //1. Open Chrome browser
            //2. Go to "http://the-internet.herokuapp.com/"
            driver= WebDriverUtil.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://the-internet.herokuapp.com/");

    }

    @Test
    public void TC1_DropdownVerification(){
        //3 click on dropdown
        ////a[.=‘Dropdown’]
        //driver.findElement(By.xpath("//a[.=‘Dropdown’]")).click();
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        // confirm default selected dropdown is "Please select an option"
        WebElement DropDownBox= driver.findElement(By.id("dropdown"));
        //using select method when there is select tagName
        Select dropdown= new Select(DropDownBox);
        String defaultOption=dropdown.getFirstSelectedOption().getText();
        String expectedDefaultOption="Please select an option";
        Assert.assertEquals(defaultOption, expectedDefaultOption, "Dropdown verification has failed");

    }
    @Test
    public void TC2_VerifyOptionFromDropdown() throws InterruptedException {

        //task2
        //1. Open Chrome browser
        //2. Go to "http://the-internet.herokuapp.com/"
        //3 click on dropdown
        //choose  option 2 from dropdown
        //choose option 1 from dropdown
        //choose option 2 from dropdown


        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        WebElement DropDownBox= driver.findElement(By.id("dropdown"));
        // Select dropdown is created by using Select tagName in HTML
        Select dropdown= new Select(DropDownBox);
        // *** we have 3 options ***
                // selectByVisibleText
                // selectByValue
                // selectByIndex

        dropdown.selectByVisibleText("Option 2");
        Thread.sleep(3000);
        //choose option 1 from dropdown
        dropdown.selectByValue("1");
        Thread.sleep(2000);
        //choose option 2 from dropdown
        dropdown.selectByIndex(2);


    }

    @AfterMethod
    public void closing() throws InterruptedException {
            Thread.sleep(4000);
            driver.close();
    }



}

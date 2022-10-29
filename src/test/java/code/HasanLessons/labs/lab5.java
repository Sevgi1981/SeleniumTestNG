package code.HasanLessons.labs;

import code.SevginVideos.base.utilities.BrowserUtils;
import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab5 {

    //   Lab5_Task1
    //Go to Amazon
    //enter Desk in search box
    //Then search for desks
    //(Use this task with TestNG framework)

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");

    }

    @Test
    public void TC1_SearchBox() {
        WebElement searchButton= driver.findElement(By.id("twotabsearchtextbox"));
        searchButton.sendKeys("Desk", Keys.ENTER);

    }

    @AfterMethod
    public void closing() {
        BrowserUtils.wait(3);
        driver.close();
    }


}

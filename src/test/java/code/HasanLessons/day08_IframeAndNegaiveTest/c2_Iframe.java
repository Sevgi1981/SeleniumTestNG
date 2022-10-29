package code.HasanLessons.day08_IframeAndNegaiveTest;

import code.HasanLessons.utilities.BrowserUtils;
import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c2_Iframe {

    //1- Open a chrome browser
    //2- Go to:http://the-internet.herokuapp.com/iframe
    //3- Switching by id or name attribute value.

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/iframe");

    }

    @Test
    public void Iframes() {
        // send "hello worls" to message box
        //3- Switching by id or name attribute value.
        //there are 3 ways to switch iframe; id/name,index and webelement

        driver.switchTo().frame("mce_0_ifr");
        BrowserUtils.staticWait(3);
        WebElement messageBox=driver.findElement(By.id("tinymce"));
        BrowserUtils.staticWait(3);
        messageBox.clear();
        BrowserUtils.staticWait(3);
        messageBox.sendKeys("Hello this is Sevgi!!!");

        // in order to do any action on main html code you need to switch to main HTML
        driver.switchTo().defaultContent();

        // /this will return you previous iframe of html block
        // driver.switchTo().parentFrame();



    }



}

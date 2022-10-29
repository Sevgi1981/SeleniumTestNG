package code.SevginVideos.day6_WebTable_Allerts_Iframe;

import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c4_iframes {

    /*

    IFRAMES

-> Iframes are basically <html> inside of another <html>
-> Selenium can only focus one thing at a time.
So we need to SWITCH driver's focus to the inner iframe to be able to perform any action with Selenium.
-> There are 3 ways to switch to iframes

	1- Locating as WebElement then using that webElement to switch.
	WebElement iframe = driver.findElement(LOCATOR);
	driver.switchTo.frame(iframe);

	2- Switching by index. We pass the index number of the frame.
	-> if you have more than one iframe on the page, indexes are used.
	<iframe> --> index 0
	<iframe> --> index 1
	<iframe> --> index 2

	driver.switchTo.frame(0);

	3- Switching by id or name attribute value.
	driver.switchTo.frame("idValue");
	driver.switchTo.frame("nameValue");

     */
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        //1- Open a chrome browser
        //2- Go to:http://the-internet.herokuapp.com/iframe
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/iframe");
    }

    @Test
    public void Iframes(){
        //in order to interact with iframes we will need to swticch driver focus to iframes
        //3- Switching by id or name attribute value.
        //driver.switchTo.frame("idValue");
        driver.switchTo().frame("mce_0_ifr");
        WebElement messageBox=driver.findElement(By.id("tinymce"));
        messageBox.clear();
        messageBox.sendKeys("Hello Its ME!!!");

        driver.switchTo().defaultContent();//returns to the main html
        //driver.switchTo().parentFrame() //this will return you previous iframe of html block

        System.out.println("driver.getTitle() = " + driver.getTitle());

    }
}

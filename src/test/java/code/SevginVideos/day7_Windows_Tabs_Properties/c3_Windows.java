package code.SevginVideos.day7_Windows_Tabs_Properties;

import code.SevginVideos.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class c3_Windows extends TestBase {
    @Test
    public void TC1_multiWindow() {
        driver.get("https://renas-practice.herokuapp.com/home");
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("WindowsII")).click();

        System.out.println("before clicking new window driver.getTitle() = " + driver.getTitle());
        ////button[@id='open-window']
        WebElement openWindowButton=driver.findElement(By.xpath("\"//button[@id='open-window']\""));
        openWindowButton.click();
        //after cliclikng this line now you have 2 window
        //and to be able to work on second window
        //change selenium focus on the next window
        System.out.println("after clicking new window driver.getTitle() = " + driver.getTitle());

        Set<String> allwindows= driver.getWindowHandles();

        List<String> windowList= new ArrayList<>();
        // Why we use ArrayList because size
        // ArrayList size is not fix, Array is fixed.
        for (String window: allwindows){
            windowList.add(window);
            driver.switchTo().window(window);
            System.out.println("after switch driver.getTitle() = " + driver.getTitle());

        }
        driver.switchTo().window(windowList.get(1));
        System.out.println("fter switch driver.getTitle() = " + driver.getTitle());

        // (//span[.='Contact'])[1]  // if there is two Contact Attributes we can use parenthesis
        // (//span[.='Contact' and @class='elementor-icon-list-text'])[1]
        // you can use and, or
        // in and both has to be true
        // in or one of them enough
        // contains will work best with ids that are dynamic which has some part as static

        driver.findElement(By.xpath("(//span[.='Contact' and @class='elementor-icon-list-text'])[1]")).click();



    }



}

package code.SevginVideos.day7_Windows_Tabs_Properties;

import code.SevginVideos.base.TestBase;
import code.SevginVideos.base.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class c2_Tabs extends TestBase {
    // inheritance example to extend my testbase class to all of my test


    @Test
    public void TC1_tabHandle(){
        //driver.get();// gave error because we need to define WebElemetn driver as public or protected
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("WindowsII")).click();

        String currentWindow=driver.getWindowHandle(); // this will only store one window
        // and it will store current window that we have
        System.out.println("currentWindow = " + currentWindow);
        System.out.println("driver.getTitle() = " + driver.getTitle());

        WebElement openTabButton=driver.findElement(By.id("open-tab"));
        openTabButton.click();

        System.out.println("after clicking tab button driver.getTitle() = " + driver.getTitle());
        //since we didnt change driver focus it will give us same one at the beginning

        Set<String> allwindows= driver.getWindowHandles();

        for(String tab : allwindows) {
            driver.switchTo().window(tab);
            BrowserUtils.wait(2);
            System.out.println(driver.getTitle());
        }


    }





}

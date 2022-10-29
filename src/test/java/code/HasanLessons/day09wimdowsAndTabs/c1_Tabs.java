package code.HasanLessons.day09wimdowsAndTabs;

import code.HasanLessons.Base.TestBase;
import code.HasanLessons.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class c1_Tabs extends TestBase {
    // oop concenpt, inheritance method
    //navigate to https://renas-practice.herokuapp.com/home
    //click on elements
    //click on windows
    //click me button

    @Test
    public void TC1_handlingTabs(){
        driver.get("https://renas-practice.herokuapp.com/home");
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        //click on wimdows
        driver.findElement(By.id("WindowsII")).click();

        //this will store current and only one window
        String currentWindow=driver.getWindowHandle();
        System.out.println("currentWindow = " + currentWindow);
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //click on new tab "click me " button
        WebElement openNewTabButton=driver.findElement(By.id("open-tab"));
        openNewTabButton.click();

        System.out.println("the current title= "+driver.getTitle());
        //since we didnt switch yet it will be at the same beginning page

        // this store all tabs
        Set<String> allTabs=driver.getWindowHandles();
        for(String tab:allTabs){
            driver.switchTo().window(tab);
            BrowserUtils.staticWait(3);
            System.out.println("current title= "+driver.getTitle());
        }


    }



}

package code.HasanLessons.day09wimdowsAndTabs;

import code.HasanLessons.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class c2_Windows extends TestBase {

    @Test
    public void TC1_MultiWindows(){
        driver.get("https://renas-practice.herokuapp.com/home");
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        //click on wimdows
        driver.findElement(By.id("WindowsII")).click();

        //this will store current and only one window
        String currentWindow=driver.getWindowHandle();
        System.out.println("currentWindow = " + currentWindow);
        System.out.println("driver.getTitle() = " + driver.getTitle());

        // click on "click me" for open new window
        WebElement openWindowButton=driver.findElement(By.id("open-window"));
        openWindowButton.click();

        Set<String> allWindows=driver.getWindowHandles();
        List<String> windowList=new ArrayList<>();
        for (String NewWindow:allWindows) {
            windowList.add(NewWindow);
            driver.switchTo().window(NewWindow);
            System.out.println("current title is =" +driver.getTitle());
        }

        //another method to switch windows
        driver.switchTo().window(windowList.get(1));
        System.out.println("the current title is=" +driver.getTitle());




    }
}

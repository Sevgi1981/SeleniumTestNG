package code.HasanLessons.day10_properties;

import code.HasanLessons.Base.TestBase;
import javafx.scene.effect.SepiaTone;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class c2_JSpractice extends TestBase {

    @Test
    public void TC1_handlingWindowsWithJsExecutor(){
        driver.get("https://www.youtube.com");
        // 1- We create javascriptExecutor object and we cast our WebDriver type instance into JavascriptExecutor type.
        ((JavascriptExecutor)driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://honda.com','_blank');");

        Set<String> tabs=driver.getWindowHandles();
        for (String tab:tabs){
            driver.switchTo().window(tab);
            String currentTab=driver.getWindowHandle();
            System.out.println("currentTab = " + currentTab);
            System.out.println("driver.getWindowHandle() = " + driver.getTitle());
        }




    }
    @Test
    public void scrollDown(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
                driver.get("http://demo.guru99.com/test/guru99home/");
                js.executeScript("window.scrollBy(-100,2000)");


    }

     /*
    The syntax of ScrollBy() methods is :

    executeScript("window.scrollBy(x-pixels,y-pixels)");
    x-pixels is the number at x-axis,
    it moves to the left if number is positive and
    it move to the right if number is negative .
    y-pixels is the number at y-axis,
    it moves to the down if number is positive and
    it move to the up if number is in negative .
    */

}

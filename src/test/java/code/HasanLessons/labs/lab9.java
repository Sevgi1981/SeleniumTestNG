package code.HasanLessons.labs;

import code.HasanLessons.Base.TestBase;
import code.HasanLessons.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class lab9 extends TestBase {

    //website:http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
//Test Scenario:
//Go to the above URL.
//Get the current window's handle and write to the console window. It must be the first window handle.
//Locate the "Visit W3Schools.com!" link and click it.
//Get all window handles and hold them in a list.
//Write to total window handle number to the console. It must be 2.
//Switch t the second window.
//Get the current window's handle and write to the console window. It must be a second window handle.
//Check the upper left side logo in the second window.
//Go back (Switch) to the first window.
//Get the current window's handle and write to the console window. It must be the first window handle.
//Check the See Run Button Text. It must contain "Run >" text.


    @Test
    public void TC1_W3school() {

        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        //Get the current window's handle and write to the console window. It must be the first window handle.
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        //Locate the "Visit W3Schools.com!" link and click it.
        driver.switchTo().frame("iframeResult");
        WebElement VisitButton=driver.findElement(By.xpath("//a[.='Visit W3Schools.com!']"));
        BrowserUtils.staticWait(3);
        VisitButton.click();
        //Get all window handles and hold them in a list.
        Set<String> allwindows= driver.getWindowHandles();
        List<String> windowList=new ArrayList<>();

        int count=0;
        for (String window:allwindows){
            windowList.add(window);
            count++;
            driver.switchTo().window(window);
            System.out.println("after switch driver Title=" +driver.getTitle());

        }


        //Write to total window handle number to the console. It must be 2.
        System.out.println("count= "+windowList.size());
        System.out.println("number of wimdows="+count);
        BrowserUtils.staticWait(3);

        //Switch to the second window.
        driver.switchTo().window(windowList.get(1));

        //Get the current window's handle and write to the console window. It must be a second window handle.
        System.out.println("after switch to 2 window=" +driver.getTitle());

        //Check the upper left side logo in the second window.
        WebElement logOnwindow= driver.findElement(By.xpath("//a[@title='Home']"));
        //Go back (Switch) to the first window.
        driver.switchTo().window(windowList.get(0));
        //Get the current window's handle and write to the console window. It must be the first window handle.
        System.out.println("first window=" +driver.getTitle());

        //Check the See Run Button Text. It must contain "Run >" text.
        WebElement RunButton=driver.findElement(By.id("runbtn"));
        System.out.println("RunButton.getText() = " + RunButton.getText());

        Assert.assertTrue((RunButton.getText().contains("Run ❯")), "RunButton does not contain Run >");


    }





}

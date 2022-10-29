package code.HasanLessons.day12_POM;

import code.HasanLessons.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class c2_ExplicitWait {

    @Test
    public void TC1_ExplicitlyWait(){

         /*
          The Implicit Wait in Selenium is used to tell the web driver to
           wait for a certain amount of time before it throws a "No Such Element Exception".
          The default setting is 0. Once we set the time, the web driver will
          wait for the element for that time before throwing an exception
         */

/*
        Explicit Wait
      The Explicit Wait in Selenium is used to tell the Web Driver to wait for
      certain conditions (Expected Conditions) or maximum time exceeded before
      throwing "ElementNotVisibleException" exception.
      It is an intelligent kind of wait, but it can be applied only for specified elements.
      */



              /*
          The Implicit Wait in Selenium is used to tell the web driver to
           wait for a certain amount of time before it throws a "No Such Element Exception".
          The default setting is 0. Once we set the time, the web driver will
          wait for the element for that time before throwing an exception
         */

/*
        Explicit Wait
      The Explicit Wait in Selenium is used to tell the Web Driver to wait for
      certain conditions (Expected Conditions) or maximum time exceeded before
      throwing "ElementNotVisibleException" exception.
      It is an intelligent kind of wait, but it can be applied only for specified elements.
      */

            //implicily wait will be effective for whole code block that used
            //explicitly wait will only be for a specific condition
            //both will have a specific given time and wont wait as long as condition met or page loaded

            WebDriverWait driverWait=new WebDriverWait(DriverUtil.getDriver(), 5);
            DriverUtil.getDriver().get("https://www.google.com");
            //verify google title
            driverWait.until(ExpectedConditions.titleIs("Google"));

            //send "iphone 14 pro"
            WebElement googleSearchBox=DriverUtil.getDriver().findElement(By.name("q"));
            driverWait.until(ExpectedConditions.elementToBeClickable(googleSearchBox));
            driverWait.until(ExpectedConditions.visibilityOf(googleSearchBox));
            googleSearchBox.sendKeys("iphone 14 pro"+ Keys.ENTER);

    }




}

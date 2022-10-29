package code.SevginVideos.Day3_locators;

import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class c3_facebookNegativeLogin {

    /*
    TASK: facebook incorect login title verification
    1-open chrome
    2-go to facebook
    3-enter incorrect username
    4-enter incorrect password
    5-verify title changed to:
    Expected : " Log into Facebook "

     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        //3-enter incorrect username
        driver.findElement(By.id("email")).sendKeys("ewsdqacvgt");
        //4-enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("wsderfg145" + Keys.ENTER);
        //5-verify title changed to:
        //Expected : " Log into Facebook "
        Thread.sleep(2000);

        String actualTitle= driver.getTitle();
        String expectedTitle="Log into Facebook";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Facebook negative test passed");
        } else {
            System.out.println("Facebook negative test failed");
            System.out.println("actula title= "+actualTitle);
        }

        driver.close();



    }

}

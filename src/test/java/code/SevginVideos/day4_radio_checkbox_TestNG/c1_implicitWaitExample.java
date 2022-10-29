package code.SevginVideos.day4_radio_checkbox_TestNG;

import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.concurrent.TimeUnit;

public class c1_implicitWaitExample {

    public static void main(String[] args) throws InterruptedException {
        //1.open browser
        //2.go to the page https://www.vinexponewyork.com/
        //3.click on attend button

        //1.open browser
        WebDriver driver= WebDriverUtil.getDriver("ChRome");
        driver.manage().window().maximize();
        //2.go to the page https://www.vinexponewyork.com/
        driver.get("https://www.vinexponewyork.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //we are giving drriver a option to wait until page loadded
        //as soon as your weblement loadded it will move on next step
        //it is not going to wait until 10 sn
        //if this was thread.sleep no matter it will always wait for 10 sn

        //Thread.sleep(5000);
        //3.click on attend button
        WebElement attendButton=driver.findElement(By.cssSelector("a[href='/attend/']"));
        attendButton.click();

    }
}
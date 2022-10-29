package code.SevginVideos.Day3_locators;

import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C4_cssLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        //1-tagname[attribute='value']

       //driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("tv");
        //input[dir='auto']
        //input[type='text']

        //2-tagname.value --> . means in css locator className
        // input.classvalue

        //3-tagname#value # means id in css
       // driver.findElement(By.id("twotabsearchtextbox"));
        //driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        // input#twotabsearchtextbox
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("tv");
        driver.close();

    }
}

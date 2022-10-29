package code.SevginVideos.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C5_FacebookClassLoc {

    /*
    Facebook header verification
    1-Open a chrome browser
    2-go to facebook.com
    3- verify header text is as expeced:
    "Connect with friends and the world around you on Facebook"


    // class name not always unique

     */

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://facebook.com");
        Thread.sleep(2000);

        String actualHeader= driver.findElement(By.className("_8eso")).getText();
        String expectedHeader="Connect with friends and the world around you on Facebook.";

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("header passed");
        } else {
            System.out.println("header failed");
            System.out.println("actual header= " +actualHeader);
        }
        driver.close();

    }
}

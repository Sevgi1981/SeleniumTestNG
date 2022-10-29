package code.SevginVideos.Day2.Day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C5_FacebookClassLog {

    public static void main(String[] args) {

        /*Facebook header verification
        1-Open Chrome browser
        2-Go to https://www.facebook.com
        3-Verify header text is as expected
        Expected: "connect with friends and the world around you on Facebook"

        */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2-Go to https://www.facebook.com
        driver.get("https://facebook.com");

        // 3-Verify header text is as expected
        // Expected: "connect with friends and the world around you on Facebook"

        String actualHeader=driver.findElement(By.className("_8eso")).getText();
        String expectedHeader="Connect with friends and the world around you on Facebook.";

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header passed");
        } else {
            System.out.println("Header failed");
            System.out.println("actual header: " +actualHeader);
        }

        driver.close();
    }
}

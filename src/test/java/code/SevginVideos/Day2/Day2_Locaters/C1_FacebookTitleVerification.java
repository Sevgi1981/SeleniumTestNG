package code.SevginVideos.Day2.Day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_FacebookTitleVerification {

/*
 - Open Chrome Browser
 - Go to facebook.com
 - Expected: "Facebook - Log In or Sign Up"
 */

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.getTitle();

        String actualTitle=driver.getTitle();
        String expectedTitle="Facebook - Log In or Sign Up";

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Facebook Title Verify has passed");
        } else {
            System.out.println("Facebook Title Verify has failed");
        }

    }
}

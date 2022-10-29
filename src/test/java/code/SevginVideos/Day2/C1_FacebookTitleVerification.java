package code.SevginVideos.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_FacebookTitleVerification {
    /*
    Open Chrome Browser
    go to facebook.com
    verify title: expected: "Facebook - Log In or Sign Up"

    */

    public static void main(String[] args) throws InterruptedException {
    // Open Chrome Browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://facebook.com");
        Thread.sleep(2000);

        String expectedTitle= "Facebook - log in or sign up";
        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Facebook Title Verification Has Passed !!");

        } else {
            System.out.println("Facebook Title Verification Has Failed !!");
        }

        driver.close();


    }
}

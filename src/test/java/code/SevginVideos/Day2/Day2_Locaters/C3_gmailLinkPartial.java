package code.SevginVideos.Day2.Day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_gmailLinkPartial {

    /*
    1-Open a chrome browser and go to google
    2-Click to Gmail link from top right
    3-Verify Title contains Gmail, expected : "Gmail"
     */
    public static void main(String[] args) {

        //1-Open a chrome browser and go to google
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

       // 2-Click to Gmail link from top right
        driver.findElement(By.partialLinkText("Gmail")).click(); //check for exact match

        String containsTitle= "Gmail";
        String actualTitle= driver.getTitle();

        if ( actualTitle.contains(containsTitle)) {
            System.out.println("Gmail passed");
        } else {
            System.out.println("Gmail failed");
        }

        driver.close();

    }
}

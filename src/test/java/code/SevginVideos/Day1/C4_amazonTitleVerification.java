package code.SevginVideos.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4_amazonTitleVerification {

    // Task-2
    // Open Chrome Browser
    // Go to google
    // navigate back
    // navigate forward
    // navigate to https://amazon.com
    // verify title contains : Smile

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().to("https://amazon.com");
        Thread.sleep(2000);

        String containsTitle= "Smile";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(containsTitle)) {
            System.out.println("Amazon Title contain Verification Has Passed !!");

        } else {
            System.out.println("Amazon Title contain Verification Has Failed !!");
        }

       driver.close();

    }

}

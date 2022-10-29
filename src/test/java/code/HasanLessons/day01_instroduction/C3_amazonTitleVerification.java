package code.HasanLessons.day01_instroduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_amazonTitleVerification {

    //Task
    //Open Chrome Browser
    //Go to google
    //Navigate back
    //Navigate forward
    //Navigate to https://www.amazon.com
    //Verify title contains : Smile
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().to("https://amazon.com");

        String expectedTitle= "Smile";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("amazon title verification has passed");
            System.out.println(actualTitle);
        } else {
            System.out.println("amazon title verification has failed");
        }
        System.out.println("Actual Title is: " +driver.getTitle());
        driver.close();

    }
}

package code.HasanLessons.day01_instroduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_browserNavigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //to maximize browser page
        driver.manage().window().maximize();
        // go to google
        driver.get("https://www.google.com");
        // to get title
        driver.getTitle(); // previous page title
        System.out.println("Title is: " +driver.getTitle());
        driver.get("https://www.etsy.com");
        System.out.println("Title is: " +driver.getTitle());
        // to get current URL
        System.out.println("Current URL: " +driver.getCurrentUrl());
        // we use static wait method to wait until given time
        Thread.sleep(5000);
        driver.get("https://www.ford.com");
        // to close browser page
        driver.close();







    }
}

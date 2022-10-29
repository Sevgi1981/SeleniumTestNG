package code.HasanLessons.labs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab1 {

    /*
    ##Task 1
    Go to https://www.etsy.com/
    Maximize window

    ##Task 2
    Go to https://www.amazon.com/
    get title and print out
     */



    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        //    Go to https://www.etsy.com/
        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.getTitle();
        System.out.println("amazon title is: "+driver.getTitle());
        Thread.sleep(2000);
        driver.close();

    }

}



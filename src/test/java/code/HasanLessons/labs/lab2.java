package code.HasanLessons.labs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab2 {

    //TC #1: Facebook title verification
//Task - 1
//Open Chrome Browser
//Go to https://www.facebook.com
//Verify title: Expected: "Facebook - Log In or Sign Up"
//Task - 2
//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile



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



        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);


        String actualTitle1=driver.getTitle();
        String expectedTitle1="Smile";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Amazon Title Verify has passed");
        } else {
            System.out.println("Amazon Title Verify has failed");
        }

        //Task 3:
        // Go to https://www.etsy.com/
        // Maximize window
        // Verify title doesnt contains "Smile"
        // Verify Current Url
        // Go to https://www.amazon.com/
        // Verify title
        // Verify Current Url
        // Navigate Back
        // Refresh
        // Quit browser

        driver.get(" https://www.etsy.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String unexpectedTitle2="Smile";
        String actualTitle2= driver.getTitle();

        if(actualTitle2.contains(unexpectedTitle2)) {
            System.out.println("Etsy Title contains Smile");
        } else {
            System.out.println("Etsy Title doesn't contain Smile");
        }

        //Assert.assertEquals(ExpectedTitle, ActualTitle);


        driver.getCurrentUrl();
        System.out.println("current URL: " +driver.getCurrentUrl());

        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        System.out.println("Title is: "+driver.getTitle());
        System.out.println("Current URL: "+ driver.getCurrentUrl());

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.quit();


    }

}

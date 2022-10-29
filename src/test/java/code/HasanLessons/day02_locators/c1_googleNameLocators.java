package code.HasanLessons.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_googleNameLocators {

    public static void main(String[] args) throws InterruptedException {

        // 1-Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2- Go to : https://www.google.com
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //3-Write "orange" in search box
        //Using locator with name locator
        driver.findElement(By.name("q")).sendKeys("orange");
        Thread.sleep(2000);
        //4- click google search button
        WebElement searchButton= driver.findElement(By.name("btnK"));
        searchButton.click();
       // driver.findElement(By.name("btnK")).click(); // same thing

        String expectedTitle= "orange";
        String actualTitle=driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)) {
            System.out.println("Orange Passed");
        }else {
            System.out.println("Orange Failed");
        }
        Thread.sleep(2000);


        //6-navigate back
        //7-write banana in search box
        //8-verify title contains banana.

        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("banana" + Keys.ENTER);

        String expectedTitle2= "banana";
        String actualTitle2=driver.getTitle();

        if(actualTitle2.startsWith(expectedTitle2)) {
            System.out.println("Banana Passed");
        }else {
            System.out.println("Banana Failed");
        }
        Thread.sleep(2000);
        driver.quit();

    }
}

package code.HasanLessons.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class c2_SetUpwithDifferentBrowser {

    public static void main(String[] args) {

        // firefox driver setup
//        WebDriverManager.firefoxdriver().setup(); // i dont have firefoxdriver
//        WebDriver driver= new FirefoxDriver();
//        driver.get("https://www.google.com");

        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.google.com");


    }


    public static class C4_idLocator {

        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://amazon.com");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            // locate web element with ID
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("clarks");
            Thread.sleep(2000);
           // driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));


        }
    }
}

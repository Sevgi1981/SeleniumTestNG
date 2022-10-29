package code.HasanLessons.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_idLocator {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        //locate web element with ID
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");


    }
}

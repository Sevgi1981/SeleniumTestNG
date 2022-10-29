package code.HasanLessons.day03_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_CssSelector {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        // css selector faster than xpath

        //driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("wallet"+ Keys.ENTER);

        // second way if the elelemt is ID you can use #
        //# means ID
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("wallet"+ Keys.ENTER);


    }
}

package code.SevginVideos.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4_amazonIdLocator {

    /*
    1-Open a chrome browser
    2-go to amazon.com
    3-type laptop in search button
    4-click on search button
    5-verify title:

     */

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://amazon.com");
        Thread.sleep(2000);
        String searchdata= "laptop";

        //id is always unique
        //but we need make sure if id is static (not dynamic)
        // dynamic when you refresh if you see id value is changing that means id is dynamic

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchdata + Keys.ENTER);

        //search button
        driver.findElement(By.id("nav-search-submit-button")).click();

        String containsTitle=searchdata;
        String actualTitle=driver.getTitle();

        if(actualTitle.contains(containsTitle)) {
            System.out.println("amazon search passed");
        } else {
            System.out.println("amazon search failed");
        }

        driver.close();
    }
}

package code.SevginVideos.Day2.Day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4_amazonIdLocator {

    public static void main(String[] args) throws InterruptedException {

        /*
        1-Open Chrome Browser
        2-go to amazon
        3-type "laptop" on search button
        4-click on search button
        5-verify title
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        String searchData= "phone";

       /*
       3-type "laptop" on search button
       id is always unique
       but we need to make sure if id is static (not dynamic)
       dynamic (when you refresh if you see id value is changing that means id is dynamic)

        */
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchData);
        //4-click on search button
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(4000);

        //5-verify title
        String containsTitle=searchData;
        String actualTitle=driver.getTitle();

        if(actualTitle.contains(containsTitle)) {
            System.out.println("Amazon search passed");
        } else{
            System.out.println("amazon failed");
            System.out.println("actual title is: "+actualTitle);
        }

        driver.close();

    }
}

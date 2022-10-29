package code.SevginVideos.Day2.Day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_googleNameLocater {

/*
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write “orange” in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with "orange" word
//6-navigate back
//7-write banana in search box
//8-verify title contains banana.
 */

    public static void main(String[] args) throws InterruptedException {

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get("https://www.google.com");

        //3- Write “orange” in search box
        //driver.findElement(By.name("q")).sendKeys(); ==> that also possible
        //WebElement searchBox= driver.findElement(By.name("q")); //no such element exception
        WebElement searchBox= driver.findElement(By.name("q"));
        //findelement will return you webelement
        searchBox.sendKeys("orange");
        searchBox.click();
        Thread.sleep(2000);
        //4- Click google search button
        WebElement googleSearchButton= driver.findElement(By.name("btnK"));
        Thread.sleep(2000);
        googleSearchButton.click();

        //5- Verify title:
        //Expected: Title should start with "orange" word
        String expectedTitle= "orange";
        String actualTitle=driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)) {
            System.out.println("Orange Passed");
        }else {
            System.out.println("Orange Failed");
        }
        Thread.sleep(2000);

        //6-navigate back

        driver.navigate().back();
        Thread.sleep(2000);

        //7-write banana in search box
        driver.findElement(By.name("q")).sendKeys("banana" + Keys.ENTER);
        //8-verify title contains banana.
        Thread.sleep(2000);

        String expectedTitle2= "banana";
        String actualTitle2=driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)) {
            System.out.println("Banana Passed");
        }else {
            System.out.println("Banana Failed");
        }

        driver.close();
    }
}

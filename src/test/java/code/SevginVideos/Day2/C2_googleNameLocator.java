package code.SevginVideos.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_googleNameLocator {

    /*
    Google search
    1-Open a chrome browser
    2-go to google.com
    3-write orange in search button
    4-click google search button
    5-verify title:
    Expected: Title should start with orange word
    6-navigate back
    7-write banana in search button
    8-verify title contains banana

     */
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://google.com");
        Thread.sleep(2000);
        WebElement searchBox=driver.findElement(By.name("q"));
        // find element will return you webElement
        searchBox.sendKeys("orange");
        searchBox.click();
        Thread.sleep(2000);

        WebElement googleSearchButton=driver.findElement(By.name("btnK"));
        googleSearchButton.click();
        Thread.sleep(2000);

        String expectedTitle="orange";
        String actualTitle= driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("passed for orange");
        } else {
            System.out.println("failed for orange");
            System.out.println("actual Title= " +actualTitle);
        }
        Thread.sleep(2000);



        /*
        6-navigate back
        7-write banana in search button
        8-verify title contains banana
         */

        driver.navigate().back();
        Thread.sleep(2000);
        //searchBox.sendKeys("banana" + Keys.ENTER);
        driver.findElement(By.name("q")).sendKeys("banana" +Keys.ENTER);
        String expectedTitle1="banana";
        String actualTitle1= driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("passed for banana");
        } else {
            System.out.println("failed for banana");
            System.out.println("actual Title= " +actualTitle);
        }
        Thread.sleep(2000);
        driver.close();


    }
}

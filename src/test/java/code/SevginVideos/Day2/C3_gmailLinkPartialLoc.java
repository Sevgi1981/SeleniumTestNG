package code.SevginVideos.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_gmailLinkPartialLoc {

    //1- open a chrome br. and go to goole.com
    //2-click to Gmail link from top right
    //3-verify title contains Gmail, expected: Gmail

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://google.com");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Gmail")).click();

        String containsTitle="Gmail";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(containsTitle)) {
            System.out.println("Gmail passed");
        } else {
            System.out.println("Gmail failed");
            System.out.println("actual title= "+actualTitle);
        }
        driver.close();
    }
}

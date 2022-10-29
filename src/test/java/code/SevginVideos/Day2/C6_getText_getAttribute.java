package code.SevginVideos.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C6_getText_getAttribute {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://google.com");
        Thread.sleep(2000);

        WebElement gmailButton= driver.findElement(By.linkText("Gmail"));

        System.out.println("gmailButton.getText() = " + gmailButton.getText());
        System.out.println("gmailButton.getAttribute()- href = " + gmailButton.getAttribute("href"));
        System.out.println("gmailButton.getAttribute()- class = " + gmailButton.getAttribute("class"));

        WebElement aboutButton= driver.findElement(By.className("MV3Tnb"));

        System.out.println("aboutButton.getAttribute() = " + aboutButton.getAttribute("href"));
        System.out.println("aboutButton.getAttribute() = " + aboutButton.getAttribute("ping"));

        driver.close();



    }
}

package code.HasanLessons.day03_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_getAttribute {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);

        WebElement gmailbutton=driver.findElement(By.xpath("//a[class='gb_d]"));
        //to get text of an WebElement
        System.out.println("Gmail button :" +gmailbutton.getText());
        //to get an attribute value
        System.out.println(gmailbutton.getAttribute("href"));






    }
}

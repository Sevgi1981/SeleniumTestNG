package code.HasanLessons.day01_instroduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4_googleVerification {

    //Task
//1.Open Chrome Browser
//2.Go to google
//3.Verify title : Expected : Google

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        String expected="Google";
        String actual= driver.getTitle();

        if( actual.equalsIgnoreCase(expected)) {
            System.out.println("Google title verification has passed");
        }else {
            System.out.println("Google title verification has failed");
        }

        driver.close();

    }
}

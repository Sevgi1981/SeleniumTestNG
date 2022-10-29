package code.HasanLessons.day01_instroduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_HelloSelenium {

    public static void main(String[] args) {

        System.out.println("Hello Selenium");

        // set up chrome driver
        // Create connection between selenium and browser
        // setup browser

        WebDriverManager.chromedriver().setup();
        // create a driver instance //   // create instance of chromedriver
        WebDriver driver = new ChromeDriver();
        // navigate to chrome browser
        driver.get("https://amazon.com");
        driver.get("https://apple.com"); // it wont open new browser





    }
}

package code.SevginVideos.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_HelloSelenium {

    public static void main(String[] args) throws InterruptedException {

        //create connection between selenium and browser
        // setup browser

        WebDriverManager.chromedriver().setup(); // chromedriver and setup is e method
        // create and instance of chromedriver to be able to test with chrome

        WebDriver driver = new ChromeDriver(); // this is also polymorphism
        //we created a driver which is a chrome driver

        Thread.sleep(2000);
        driver.manage().window().maximize(); // this line will maximize our browser

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); //data:,
        // before you move on any website driver will be opened in empty page
        // url is empty as well

        // lets go to amazon
        Thread.sleep(2000);
        driver.get("https://www.amazon.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); //https://www.amazon.com/
        System.out.println("driver.getTitle() = " + driver.getTitle()); // Amazon.com. Spend less. Smile more.

        Thread.sleep(2000);
        driver.close();

    }
}

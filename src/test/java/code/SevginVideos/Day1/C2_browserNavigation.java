package code.SevginVideos.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_browserNavigation {

    public static void main(String[] args) throws InterruptedException {

        //create the connection between chrome and selenium
        WebDriverManager.chromedriver().setup();

        //create an instance of chrome driver
        WebDriver chromeDriver= new ChromeDriver();

        // maximize the page
        chromeDriver.manage().window().maximize();

        chromeDriver.get("https://amazon.com");
        Thread.sleep(2000);

        chromeDriver.navigate().back();
        Thread.sleep(2000);

        chromeDriver.navigate().forward();
        Thread.sleep(2000);

        System.out.println("chromeDriver.getTitle() = " + chromeDriver.getTitle());

        chromeDriver.navigate().to("https://facebook.com");
        Thread.sleep(2000);

        System.out.println("chromeDriver.getTitle() = " + chromeDriver.getTitle());

        chromeDriver.close();






    }
}

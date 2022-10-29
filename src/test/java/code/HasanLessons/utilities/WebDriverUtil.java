package code.HasanLessons.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtil {

    // create an util that the get browser and create connection between browser and selenium
    // WebDriverUtil will set up the browser for us

    public static WebDriver getDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            // chrome browser needs to be setup
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else {
            System.out.println("Browser that you provide is not exist");
            System.out.println("Provided Browser is= " +browser);
            return null; // return empty browser
        }

    }

}

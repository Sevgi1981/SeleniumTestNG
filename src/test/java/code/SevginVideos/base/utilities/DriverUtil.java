package code.SevginVideos.base.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverUtil {
    //to be able to achive singelton design pattern we will need to have priavte constructor
    //no one can be able to create object from this class beacause we are making constructor priavate .

    private DriverUtil() {

    }

    private static WebDriver driver; // we are using encapsulation logic in here by making driver priavate
    //we will need to create getter and setter for driver
    // we want to have only one copy using static

    public static WebDriver getDriver(){

        if (driver==null){
            String browser=PropertiesReadingUtil.getProperties("browser");//chrome-headless

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
            }

        }
        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }


}

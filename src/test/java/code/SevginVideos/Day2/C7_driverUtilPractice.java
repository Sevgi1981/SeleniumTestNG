package code.SevginVideos.Day2;

import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;

public class C7_driverUtilPractice {

    public static void main(String[] args) {

        WebDriver driver= WebDriverUtil.getDriver("firefox");

        driver.get("https://www.google.com");
        driver.close();

        WebDriver driver2=WebDriverUtil.getDriver("chrome");
        driver2.get("https://www.facebook.com");
        driver2.close();

        WebDriver driver3=WebDriverUtil.getDriver("CHROME"); // works
        //WebDriver driver4=WebDriverUtil.getDriver("edge") ; // doensnt work
        driver3.get("https://www.facebook.com");

    }
}

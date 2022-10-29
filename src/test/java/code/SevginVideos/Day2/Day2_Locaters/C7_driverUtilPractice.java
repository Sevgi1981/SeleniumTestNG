package code.SevginVideos.Day2.Day2_Locaters;

import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;

public class C7_driverUtilPractice {

    public static void main(String[] args) {

     //   WebDriver driver= WebDriverUtil.getDriver("firefox");
//        driver.get("https:amazon.com");

        WebDriver driver1= WebDriverUtil.getDriver("chrome");
        driver1.get("https://amazon.com");
        driver1.close();

       // WebDriver driver3=WebDriverUtil.getDriver("CHROME"); // WORKS
        WebDriver driver3=WebDriverUtil.getDriver("edge"); // WORKS
        driver3.get("https://facebook.com");
        driver1.close();


    }

}

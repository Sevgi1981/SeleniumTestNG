package code.SevginVideos.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class C5_DifferentBrowserSetup {

    public static void main(String[] args) {

        //before you run make sure you have the browser type in your computer

        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();

//        // I dont have firefoxdriver so i got error
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver2= new FirefoxDriver();

        WebDriverManager.iedriver().setup();
        WebDriver driver3= new InternetExplorerDriver();

        driver.get("https://amazon.com");
        driver3.get("https://google.com");

    }
}

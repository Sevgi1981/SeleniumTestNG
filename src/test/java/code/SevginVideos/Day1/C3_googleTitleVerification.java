package code.SevginVideos.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_googleTitleVerification {

    // Task
    // 1- open Chrome Browser
    // 2- Go to google
    // 3- Verify title: Expected : Google

    public static void main(String[] args) throws InterruptedException {

        // 1- open Chrome Browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(2000);

        // 2- Go to google
        driver.get("https://google.com");
        Thread.sleep(2000);

        // 3- Verify title: Expected : Google
        String expectedTitle= "Google";  //Google Title Verification Has Passed !!
        // if we change expected title it will print failed

        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Google Title Verification Has Passed !!");
        } else {
            System.out.println("Google Title Verification Has Failed !!");
            System.out.println("Browser Title is: " +actualTitle);
        }

        driver.close();



    }
}

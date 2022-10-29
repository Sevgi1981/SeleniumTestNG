package code.StudyHall;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class day_08_BrokenLink {


    WebDriver driver=null;

    @Test
    public void Brokenlink()  {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/broken");
        HttpURLConnection htt=null;

        int response=200;
        String url="";
        List<WebElement> links=driver.findElements(By.tagName("a"));

        Iterator<WebElement> iterator= links.iterator();

        while (iterator.hasNext()){
            url= iterator.next().getAttribute("href");
            try {
                htt=(HttpURLConnection)(new URL(url).openConnection());
                htt.setRequestMethod("HEAD");
                htt.connect();
                response= htt.getResponseCode();
                if(response >= 400){
                    System.out.println(url+" is a broken link and Code is: " +response);
                }
                else{
                    System.out.println(url+" is a valid link");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}



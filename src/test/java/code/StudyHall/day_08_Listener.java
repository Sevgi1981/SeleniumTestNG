package code.StudyHall;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class day_08_Listener {


    WebDriver driver=null;
    String expectedTitleEbay="Electronics, Cars, Fashion, Collectibles & More | eBay";



    @Test
    public void Test1(){
        System.out.println("I am inside Test1");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitleEbay);
    }
    @Test
    public void Test2(){
        System.out.println("I am inside Test2");
        throw new SkipException("TestSkipped");
    }

    @Test
    public void Test3(){
        System.out.println("I am inside Test3");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,"Ebay");
    }

}

package code.StudyHall;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class da04_Monkey_Testing {
//Monkey testing: You as an user click the functionalities randomly.
// you do not follow the steps. you try to break the app by clicking random links
//


    @Test
    public void test() throws InterruptedException {
        //1-set up the Driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //2 go to the website
        driver.get("https://www.etsy.com/");
        Thread.sleep(3000);
        //3 list all links on the header
        List<WebElement> header= driver.findElements(By.cssSelector("ul[data-ui='top-nav-category-list'] li a"));
        // print how many links have in the header (you can you Assertion)
        int headerCount=header.size();
        System.out.println(headerCount);
        System.out.println();

        //5 every time you use lisy<Weblement> , oyu need to use for loop in order to do some actions
        for (int i =0; i <headerCount ; i++) {
            //5 this functionality in order to create random index
            int randomIndex= (int) Math.floor(Math.random() * headerCount);
            System.out.println(randomIndex);
            //6 store random index
            WebElement element=header.get(randomIndex);
            System.out.println(element.getText());
            // 7 click that random index
            element.click();
            //8 navigate back to click another random link
            driver.navigate().back();
            Thread.sleep(2000);

            //element.click();
            //9 if use element.click() again, Selenium wont recognise and you will get StaleElementReferenceException
            // The reason for that you can not use same element when you navigate back because it's count as outdated so
            // You need to declare that element again to avoid exception
            header=driver.findElements(By.cssSelector("ul[data-ui='top-nav-category-list'] li a"));
        }
    }
}


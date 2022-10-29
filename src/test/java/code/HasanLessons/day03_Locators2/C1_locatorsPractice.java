package code.HasanLessons.day03_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C1_locatorsPractice {

    public static void main(String[] args) throws InterruptedException {

        //1. Open Chrome browser
        //2. Go to https://www.apple.com
        //3. Click to iPhone
        //4. Print out the texts of all links

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();
        Thread.sleep(2000);

        // child to parent
        ////span[.='iPhone']/..  ==> this will you get the parent code
        //  -//ul[@class='ac-gn-list']//following::li[5] ==> parent to child ==> unordered list


        ////span[.='iPhone'] ==> parent
        //  - //ul[@class='ac-gn-list']


        driver.findElement(By.xpath("//span[.='iPhone']/..")).click();
        //4.print out the texts of all links
        // print out all links
        // count of links that does not have text
        // count of links that has text

        // find elements used only when more than 1 webElement
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        Thread.sleep(2000);

        int linkWithoutText=0;
        int linkwithText=0;

        for (WebElement eachLink: allLinks){
            String elementToText=eachLink.getText();
            System.out.println(elementToText);

            if (elementToText.isEmpty()){
                linkWithoutText++;
            } else {
                linkwithText++;
            }

        }
        System.out.println("link with text: " +linkwithText);
        System.out.println("link without text: " +linkWithoutText);
        System.out.println("all links counts: " +allLinks.size());











    }
}

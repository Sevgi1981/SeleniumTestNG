package code.HasanLessons.labs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class lab3_task_4 {

    public static void main(String[] args) throws InterruptedException {


        /*

        task3
        //Open a Browser
        //Navigate to https://flipkart.com website.
        //Write a method to find the count (number of) links on the homepage of Flipkart.
        //Write another method to print link text and URLs of all the links on the page of Flipkart.
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipkart.com");
        Thread.sleep(2000);

        //the other way
        //List<WebElement> allLinks= driver.findElements(By.xpath("//body//a"));

        List<WebElement> allLinks= driver.findElements(By.xpath("//body//a"));
        int countLinkWithText=0;
        int countLinkWithoutText=0;

        for(WebElement eachLink:allLinks) {
            String elementToText=eachLink.getText();
            System.out.println(elementToText);



            if(elementToText.isEmpty()){
                countLinkWithoutText++;
            } else {
                countLinkWithText++;
            }

        }
        System.out.println("total of the number of the homepage: " +allLinks.size());
        System.out.println("total count of links With Text: " + countLinkWithText);
        System.out.println("total count of links Without Text: " + countLinkWithoutText);

        System.out.println("All Url names:\n\n"+allLinks);










    }
}

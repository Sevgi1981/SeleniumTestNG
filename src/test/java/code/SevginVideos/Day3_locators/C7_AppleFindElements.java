package code.SevginVideos.Day3_locators;

import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C7_AppleFindElements {

    // 1.Open Chrome browser
    // 2.Go to https://www.apple.com
    // 3.Click to iPone
    //4.Print out the texts of all links

    public static void main(String[] args) {
        WebDriver driver= WebDriverUtil.getDriver("Chrome");
        driver.get("https:/www.apple.com");
        driver.manage().window().maximize();

        // 3.Click to iPone
        //<span class="ac-gn-link-text">iPhone</span>
        // 1-//tagname[@attribute='value']-- looks for tagname attribute and value
        //driver.findElement(By.xpath("//span[@class='ac-gn-link-text']")).click();


        // 3-//tagname[.='text'] --looks for exact text match for any attribute
        // xpath has ability to go also from child parent
        // to child to parent use  /..
        driver.findElement(By.xpath("//span[.='iPhone']/..")).click();

        // 4.Print out the texts of all links
        ////print out all links
        //        //count of links that doesnt have text
        //        //count of links that has text
        //        //a tag has all the link
        // a tag names has link

        List<WebElement> allLinks=driver.findElements(By.xpath("//body//a"));

        int linkWithText=0;      // to count elements that has text
        int linkwithoutText=0;   // to count elements that doent have text

        for(WebElement eachLink:allLinks){
            String elementsToText=eachLink.getText(); //"" , "Airtag" // they can be empty or airtag
            System.out.println(elementsToText);

            if(elementsToText.isEmpty()){
                linkwithoutText++;

            }else {
                linkWithText++;

            }

        }
        System.out.println("linkWithText = " + linkWithText);
        System.out.println("linkwithoutText = " + linkwithoutText);
        System.out.println("allLinks.size() = " + allLinks.size());

        /*
        linkWithText = 170
        linkwithoutText = 56
        allLinks.size() = 226
         */



    }
}

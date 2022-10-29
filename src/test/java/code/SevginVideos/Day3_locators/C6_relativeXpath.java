package code.SevginVideos.Day3_locators;

import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//
//Locater approaches
//first option will be id because it is unique (but we will also need to make sure if it is static)
//second option can be name class name linktext if it is unique (usually name and classnames are not unique)
//then i prefer xpath

//    Differences Css and Xpath
//-- Xpath has custom methods but css doesnt have those
//-- Xpath has abilty to go from child to parrent and parent to child
//-- but in css you can only go from parent to child
//-- css it works little faster then Xpath
//

public class C6_relativeXpath {

    /*

1-//tagname[@attribute='value']-- looks for tagname attribute and value
2-//tagname[contains(@attribute, 'value') --locate webelemnt  with the given value if contains
dynamic id usually has static part and dynamic part
ex
id= hello123 /refresh page
id= hello578 /refresh page
id= hello23456
//tagname[contains(@id, 'hello')

3-//tagname[.='text'] --looks for exact text match for any attribute

     */


    public static void main(String[] args) {

        WebDriver driver=WebDriverUtil.getDriver("chrome");
        driver.get("https://practicerenastech.com");
        driver.manage().window().maximize();

        //  -- //mat-card[@id='selenium-Elements']
               // tagname-attribute-

        // 1-//tagname[@attribute='value']-- looks for tagname attribute and value
        driver.findElement(By.xpath("//mat-card[@id='selenium-Elements']"));

        // 2-//tagname[contains(@attribute, 'value') --locate webelemnt  with the given value if contains
        driver.findElement(By.xpath("//mat-card[contains(@id , 'Element')]")).click();


        // 3-//tagname[.='text'] --looks for exact text match for any attribute
        // //h1[.='Elements part i']


        WebElement seleniumheader1=driver.findElement(By.xpath("//h1[.='Elements part i']"));
        // it is not clickable so we can check isdisplayed or not

        if(seleniumheader1.isDisplayed()){  // you can check webElement
            // isdisplayed will check if the element is present on the page
            System.out.println("header is present");
        }else {
            System.out.println("header is not present");
            System.out.println("sleniumheader is: " +seleniumheader1);
        }





    }
}

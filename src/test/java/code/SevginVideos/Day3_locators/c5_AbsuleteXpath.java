package code.SevginVideos.Day3_locators;

import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class c5_AbsuleteXpath {

    public static void main(String[] args) {

        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https:/www.practicerenastech.com");
        WebElement header=driver.findElement(By.xpath("/html/body/app-root/div/div/app-home/h1[1]"));

        /*
         1-Absuluate Xpath
        -start with /
        -you need to start top parent (begning of html code)
        -it is not usefull becasuse it takes from very top from to child
         */
        //isdisplayed == it will check if webelement is present on the page
        // validate if selenium header is present in the renastech page

        if (header.isDisplayed()){
            System.out.println("Selenium Header is present");
        } else {
            System.out.println("Selenium Headet is not present");
            System.out.println("header = " + header);
        }

    }

}

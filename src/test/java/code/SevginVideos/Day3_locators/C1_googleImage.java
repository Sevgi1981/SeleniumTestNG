package code.SevginVideos.Day3_locators;

import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C1_googleImage {

    public static void main(String[] args) {

        // Google Image link
        //click to image link from top right
        // verify title contains Image

        WebDriver driver=WebDriverUtil.getDriver("chrome");
        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Images")).click();
        //driver.findElement(By.partialLinkText("Ima"));

        //this webelemetn has also class name but it is unique gmail button also has same class name
        // and gmail button is first maching one


        // verify title contains Image

        String actualTitle=driver.getTitle();
        String expectedTitle="Images";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("title passed");
        } else {
            System.out.println("title failed");
        }

        driver.close();


    }
}

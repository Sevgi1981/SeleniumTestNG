package code.SevginVideos.Day3_locators;

import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C2_googleFeelingLucyButton {

    public static void main(String[] args) throws InterruptedException {

        // Task :  Google Feeling Lucky button
        //1-Open a chrome browser
        //2-got to google.com
        //3-write apple in search button
        //verify title contains Apple
        WebDriver driver=WebDriverUtil.getDriver("chrome");
        driver.get("https://www.google.com");

        Thread.sleep(2000);
        //class= gLFyf gsfi ==> if has space in class name it doesnt work correctly. because elenium may consider
        // it has two different element

       // driver.findElement(By.name("q")).sendKeys("Apple");
        //driver.findElement(By.name("gLFyf gsfi")).sendKeys("Apple");
        // having spaces in classname will make your code fail
        // you can remove one part see if it is unique you can locate
        driver.findElement(By.className("gLFyf")).sendKeys("Apple");
        Thread.sleep(2000);
        driver.findElement(By.className("RNmpXc")).click();
        Thread.sleep(2000);

        String actualTitle= driver.getTitle();
        String expectedTitle="Apple";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
            System.out.println("actual title= "+actualTitle);
        }

        driver.close();




    }
}

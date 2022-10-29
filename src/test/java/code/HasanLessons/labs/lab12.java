package code.HasanLessons.labs;

import code.HasanLessons.Base.TestBase;
import code.HasanLessons.utilities.BrowserUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class lab12 extends TestBase {

    //Navigate to "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"
//Click on the "Try it" button
//Enter Your name on the Alert Box and Accept alert
//Verify that your name shown on the page
//Click on the 'home sign' (it is on the left side of page)
//Switch to second window tab
//Click on the "log in" button
//Enter your credentials
//Enter the show password button
//Switch to first tab
    @Test
    public void TC1(){

        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.switchTo().frame("iframeResult");

        WebElement tryIt=driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", tryIt);

        //Enter Your name on the Alert Box and Accept alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Sevgi" +Keys.ENTER);
        BrowserUtils.staticWait(3);
        alert.accept();

        //Verify that your name shown on the page
        WebElement myName=driver.findElement(By.xpath("//p[@id='demo']"));

        if(myName.isDisplayed()){
            System.out.println("Actual text is= " +myName.getText());
        } else {
            System.out.println("Text is not displayed");
        }

        //Click on the 'home sign' (it is on the left side of page)
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@id='tryhome']")).click();

        //Switch to second window tab
        System.out.println("driver.getTitle() = " + driver.getTitle());

        Set<String> allTabs=driver.getWindowHandles();
        List<String> windowlist=new ArrayList<>();

        for(String eachTab:allTabs){
            windowlist.add(eachTab);

        }
        driver.switchTo().window(windowlist.get(1));
        System.out.println(driver.getTitle());

        //Click on the "log in" button
        driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();


        //Enter your credentials
        WebElement emailBox=driver.findElement(By.id("modalusername"));
        WebElement passwordBox=driver.findElement(By.xpath("//input[@id='current-password']"));
        emailBox.sendKeys("sevgi");
        BrowserUtils.staticWait(3);
        passwordBox.sendKeys("12345");
        BrowserUtils.staticWait(3);
        //Enter the show password button
        WebElement showButton=driver.findElement(By.className("PasswordInput_show_pwd_btn__Ncc9S"));

        showButton.click();
        BrowserUtils.staticWait(3);

        //Switch to first tab
        driver.switchTo().window(windowlist.get(0));
        BrowserUtils.staticWait(3);


    }



}

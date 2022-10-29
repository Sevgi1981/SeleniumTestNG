package code.HasanLessons.labs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab3_task_1_2_3 {
    /*
    //TASK 1: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write “apple” in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with "apple" word
//6-navigate back
//7-write cherry in search box
//8-verify title contains cherry.*/

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);

        String expected= "apple";
        String actual=driver.getTitle();

        if (actual.startsWith(expected)) {
            System.out.println("Title Banana Verify Passed");
        } else {
            System.out.println("Title Banana Verify Failed");
        }
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("cherry");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);


        String expected1= "cherry";
        String actual1=driver.getTitle();

        if (actual.contains(expected)) {
            System.out.println("Title Cherry Verify Passed");
        } else {
            System.out.println("Title Cherry Verify Failed");
        }
        Thread.sleep(2000);

        driver.quit();




    /*
    //TASK2: Google Feeling lucky button
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Write "apple" in search box
    //click i am feeling lucky button
    //Verify title contains Apple

     */

       // WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://google.com");
        driver1.manage().window().maximize();
        Thread.sleep(2000);
        driver1.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(2000);
        driver1.findElement(By.name("btnI")).click();
        Thread.sleep(2000);

        String expected2="Apple";
        String actual2=driver1.getTitle();

        if (actual2.contains(expected2)) {
            System.out.println("Title Apple Verify Passed");
        } else {
            System.out.println("Title Apple Verify Failed");
        }

        Thread.sleep(2000);
        driver1.close();

        //go to https://opensource-demo.orangehrmlive.com/
        //locate user name and send user name, (username=Admin)
        //locate user password and send password (password=admin123)
        //click on the login button

        //WebDriverManager.chromedriver().setup();
        WebDriver driver2= new ChromeDriver();
        driver2.get("https://opensource-demo.orangehrmlive.com");
        driver2.manage().window().maximize();
        Thread.sleep(2000);
        driver2.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);
        driver2.findElement(By.name("password")).sendKeys("admin123"+Keys.ENTER);
        Thread.sleep(4000);
        driver2.close();




    }


}



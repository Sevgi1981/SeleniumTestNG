package code.StudyHall;

import code.HasanLessons.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class day_09_Iframe_Windowhandles_Practice extends TestBase {

//https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
//        Go to the above URL.
//        Get the current window's handle and write to the console window. It must be the first window handle.
//        Locate the "Visit W3Schools.com!" link and click it.
//        Get all window handles and hold them in a list.
//        Write to total window handle number to the console. It must be 2.
//        Switch t the second window.
//        Get the current window's handle and write to the console window. It must be a second window handle.
//        Check the upper left side logo in the second window.
//        Go back (Switch) to the first window.
//        Get the current window's handle and write to the console window. It must be the first window handle.
//        Check the See Run Button Text. It must contain "Run >" text.
    //   WebDriver driver;
//    @BeforeMethod
//    public void setup(){
//        WebDriverManager.chromedriver().setup();
//        driver= WebDriverUtil.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
//
//
//    }

    @Test
    public void TC_W3SchoolWindowIframeTesting(){
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        String currentWindowAtThisPoint=driver.getWindowHandle();
        System.out.println(currentWindowAtThisPoint);
        System.out.println(driver.getTitle());

        driver.switchTo().frame("iframeResult");
        WebElement link=driver.findElement(By.xpath("//a[.='Visit W3Schools.com!']"));
        link.click();

        Set<String> allwindows=driver.getWindowHandles();
        System.out.println(allwindows.size());//this will tell us how many windows or tabs are open currently
        List<String> windowslist=new ArrayList<>();
        for (String eachWindow : allwindows){
            windowslist.add(eachWindow);
            driver.switchTo().window(eachWindow);
            System.out.println(driver.getTitle()+" is the current title ");
        }

        WebElement W3LogoOnSecondWindow=driver.findElement(By.xpath("//a[@title='Home']"));
        Assert.assertTrue(W3LogoOnSecondWindow.getAttribute("title").contains("hom"));//This is hard assertion therefore test execution will stop here if it fails
//        SoftAssert softAssert=new SoftAssert();
//        softAssert.assertTrue(W3LogoOnSecondWindow.getAttribute("title").contains("hom"));
        driver.switchTo().window(windowslist.get(0));
        System.out.println(currentWindowAtThisPoint);

        WebElement runButton=driver.findElement(By.id("runbtn"));
        String expectedTextForRunButton="Run ❯";
        Assert.assertTrue(runButton.getText().contains(expectedTextForRunButton));
    }



}

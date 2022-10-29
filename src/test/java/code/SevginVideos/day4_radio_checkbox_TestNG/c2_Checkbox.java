package code.SevginVideos.day4_radio_checkbox_TestNG;

import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class c2_Checkbox {

    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        //2. Go to https://demo.guru99.com/test/radio.html
        //3. Verify checkbox1 is not selected
        //4. Click to checkbox2
        //5. Verify checkbox2 is selected

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //driver.findElement(By.id("vfb-6-0")); //best option
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@value='checkbox1']"));
        //driver.findElement(By.xpath("//input[@id='vfb-6-0']"));

        //        //3. Verify checkbox1 is not selected
        if (!checkBox1.isSelected()) {
            System.out.println("Default Verification for checkbox 1 passed");
        } else {
            System.out.println("Default Verification for checkbox 1 failed!!");
        }

        //4. Click to checkbox2
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
        checkbox2.click();
        //5. Verify checkbox2 is selected

        if (checkbox2.isSelected()) {
            System.out.println(" Verification for checkbox 2 after click passed");
        } else {
            System.out.println(" Verification for checkbox 2 after click failed");
        }

        //Thread.sleep(3000);
        driver.close();

    }
}
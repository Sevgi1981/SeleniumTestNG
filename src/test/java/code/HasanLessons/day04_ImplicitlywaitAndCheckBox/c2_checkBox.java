package code.HasanLessons.day04_ImplicitlywaitAndCheckBox;

import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class c2_checkBox {

    //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify checkbox1 is not selected
//4. Click to checkbox2
//5. Verify checkbox2 is selected

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //2. Go to https://demo.guru99.com/test/radio.html
        driver.get("https://demo.guru99.com/test/radio.html");
        //3. Verify checkbox1 is not selected
        WebElement checkBox1=driver.findElement(By.id("vfb-6-0"));

        if(!checkBox1.isSelected()) {
            System.out.println("checkbox1 is not selected, verification has passed");

        } else {
            System.out.println("checkbox1 is selected, verification has failed");
        }

        //4. Click to checkbox2

        WebElement checkBox2=driver.findElement(By.id("vfb-6-1"));
        //5. Verify checkbox2 is selected
        checkBox2.click();
        if(checkBox2.isDisplayed()){
            System.out.println("checkbox2 is selected, verification has passed");
        } else  {
            System.out.println("checkbox2 is not selected, verification has failed");
        }
        Thread.sleep(3000); // we want to see checkBox2 is selected
        driver.quit();

    }
}

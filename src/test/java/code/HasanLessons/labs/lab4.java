package code.HasanLessons.labs;

import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class lab4 {

    ////1. Open Chrome browser
    ////2. Go to https://demo.guru99.com/test/radio.html
    ////3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
    ////4. Click to checkbox3
    ////5. Verify checkbox3 is selected

    public static void main(String[] args) {

        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ////3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement each :checkboxes) {

            if(!each.isSelected()){
                System.out.println(each.getAttribute("value")+ " is not selected");
            } else {
                System.out.println(each.getAttribute("value")+ "  is selected");
            }

        }

        ////4. Click to checkbox3
        WebElement checkbox3=driver.findElement(By.xpath("//input[@value='checkbox3']"));
        checkbox3.click();

        ////5. Verify checkbox3 is selected
        if (checkbox3.isSelected()){
            System.out.println("checkbox3 is selected");
        } else {
            System.out.println("checkbox3 is not selected");
        }

    }


}

package code.StudyHall;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class day03_locatorsCont {

    //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");
        Thread.sleep(2000);
        // input[@value='checkbox3']
        // input[.='Checkbox3']
        WebElement checkbox3=driver.findElement(By.xpath("//input[@value='checkbox3']"));
        Thread.sleep(2000);
        // we want to ifit is selected or not. if it is selected we will print this message"the check box is selected"
        // and if it is not selected we will select it and print this same

        if(checkbox3.isSelected()) {
            System.out.println("the checkbox3 is selected");
        }else {
            System.out.println("the checkbox3 is not selected");
            System.out.println("the checkbox3 is selected now");
            checkbox3.click();
        }
        //input[@type='checkbox']"
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement each: checkboxes) {

            if (!each.isSelected()){
                System.out.println(each.getAttribute("value")+"is not selected");
                if (each.getAttribute("value").contains("checkbox3")){
                    each.click();
                }
            }else {
                System.out.println(each.getAttribute("value")+"is selected");

            }
        }


    }

}

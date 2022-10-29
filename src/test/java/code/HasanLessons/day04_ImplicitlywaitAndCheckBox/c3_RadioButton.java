package code.HasanLessons.day04_ImplicitlywaitAndCheckBox;

import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class c3_RadioButton {

// Navigate to https://courses.letskodeit.com/practice
// click on BMW RADIO button
// verify that its selected

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://courses.letskodeit.com/practice");
        // click on BMW RADIO button
        WebElement BMWRadioButton=driver.findElement(By.id("bmwradio"));
        BMWRadioButton.click();
        Thread.sleep(3000);

        // verify that its selected
        boolean BMWRadioSelected= BMWRadioButton.isSelected();

        if(BMWRadioSelected){
            System.out.println("BMWRadioButton is selected, verification has passed");
        } else {
            System.out.println("BMWRadioButton is not selected, verification has failed");
        }

        //verify that honda is not selected
        WebElement HondaRadio=driver.findElement(By.linkText("//input[@id='hondaradio']"));

        if(!HondaRadio.isDisplayed()){
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

        Thread.sleep(3000);
        driver.quit();



    }


}

package code.StudyHall;

import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class day07_Dropdown_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");


    }

    @Test
    public void TC_1_Dropdown(){
        WebElement firstDropdow=driver.findElement(By.xpath("//select[@id='first']"));
        WebElement secondDropdown=driver.findElement(By.xpath("//select[@id='second']"));

        Select select=new Select(firstDropdow);
        //select.selectByIndex(3);
        //select.selectByValue("Yahoo");
        select.selectByVisibleText("Iphone");

        select= new Select(secondDropdown);
        select.selectByIndex(1);

        for (int i = 0; i < 4; i++) {
            if(select.getOptions().get(i).getText().contains("Burger")){
                select.selectByIndex(i);
            }

            System.out.println(select.getOptions().get(i).getText());

        }

    }



}

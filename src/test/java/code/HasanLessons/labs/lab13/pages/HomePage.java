package code.HasanLessons.labs.lab13.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage1{

   @FindBy(xpath = "//tr[@class='heading3']/td")
    public WebElement managerIDText;



}

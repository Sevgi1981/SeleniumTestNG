package code.HasanLessons.labs.lab13.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerEntry extends BasePage1 {

    @FindBy(xpath = "//input[@name='city']")
     public WebElement city;
    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submit;
    @FindBy(xpath = "//input[@onblur='validatecustomername();']")
    public WebElement customer;
    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement pin;
    @FindBy(xpath = "//*[@name='addr']")
    public WebElement adress;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@value='m']")
    public WebElement gender;
    @FindBy(xpath = "//input[@name='telephoneno']")
    public WebElement phone;
    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='dob']")
    public WebElement date;


}

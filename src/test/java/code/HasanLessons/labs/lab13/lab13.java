package code.HasanLessons.labs.lab13;

import code.HasanLessons.Base.TestBase2;
import code.HasanLessons.labs.lab13.pages.HomePage;
import code.HasanLessons.labs.lab13.pages.LoginPage;
import code.HasanLessons.labs.lab13.pages.NewCustomerEntry;
import code.HasanLessons.utilities.BrowserUtils;
import code.HasanLessons.utilities.DriverUtil;
import code.SevginVideos.base.utilities.PropertiesReadingUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class lab13 extends TestBase2 {
//
//    POM Example TEST - Share Github Link for this
//    Step 1) Go to Guru99 Demo Site http://demo.guru99.com/V4/
//    Step 2) In Login page check text "Guru99 Bank" is present
//    Step 3) Login into application with given credentials(you need to enter your email in order to get credentials in advance)
//    Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
//    Step 5) Click on new customer button and verify you are in New Customer Entry Page
//    Step 6) Fill the information for new customer
//    Step 7) Verify new customer added sucessfully
//##// Hint-TestNG :

//Pages : In this task you will need to create 3 pages class
//First one for login page where you need to locate : username,password,Login and Guru99 Bank text
//Second page is for home page and you need to locate : text Manger Id
//Third page is for New Customer Entry Page where you need to locate
// : customer information boxes such as name,adrees,gender,email,password etc.
//Configuration File
//store username,pasword , and url
//Utils
//use our ready utils such as readingproperties,driver, browser utils
//Base
//use our ready testbase classes.
//Testing
// while testing first you will verify "Guru99 Bank" is present
// then you need to Login into application
// then verify Home page contains text as "Manger Id: mngr368294"
// click on new customer tab then verify title contains New Customer Entry Page
// fill all information to be able create a customer // verify the message customer registered sucessfully.

    LoginPage loginPage;

    @Test
    public void TC1() {

       loginPage= new LoginPage();

        //    Step 1) Go to Guru99 Demo Site http://demo.guru99.com/V4/
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("Guru_Url"));

        //    Step 2) In Login page check text "Guru99 Bank" is present
        WebElement GuruText=DriverUtil.getDriver().findElement(By.xpath("//h2[.='Guru99 Bank']"));
        Assert.assertEquals(GuruText.getText(),"Guru99 Bank","Text is not present");

        //    Step 3) Login into application with given credentials
        //    (you need to enter your email in order to get credentials in advance)

        loginPage.loginGuruMethod(PropertiesReadingUtil.getProperties("Guru_UserName")
              ,PropertiesReadingUtil.getProperties("Guru_Password"));

        //    Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"

        HomePage managerID=new HomePage();
        String expected="Manger Id: mngr368294";

        String actual=managerID.managerIDText.getText();
        System.out.println(actual);

        if (actual.contains(expected)){
            System.out.println("Same Text");
        } else {
            System.out.println("Different Text failed");
        }

        System.out.println(DriverUtil.getDriver().getTitle());

        //    Step 5) Click on new customer button and verify you are in New Customer Entry Page
        DriverUtil.getDriver().findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();


        String actualTitle=DriverUtil.getDriver().getTitle();
        String expectedTitle="New Customer Entry Page";

        if(actualTitle.contains(expectedTitle)) {
            System.out.println("your are in New Customer Entry Page");
        } else {
            System.out.println("Your are not New Customer Entry Page");
            System.out.println("Your are in " +DriverUtil.getDriver().getTitle()+ "page");
        }

        //    Step 6) Fill the information for new customer

        NewCustomerEntry newCustomerEntry=new NewCustomerEntry();

        BrowserUtils.staticWait(1);
        newCustomerEntry.customer.sendKeys("Sevgi");
     BrowserUtils.staticWait(1);
        newCustomerEntry.gender.click();
     BrowserUtils.staticWait(1);
        newCustomerEntry.date.sendKeys("0019810110");
     BrowserUtils.staticWait(1);
        newCustomerEntry.adress.sendKeys("Carl Shepway");
     BrowserUtils.staticWait(1);
        newCustomerEntry.city.sendKeys("North York");
     BrowserUtils.staticWait(1);
        newCustomerEntry.state.sendKeys("Canada");
     BrowserUtils.staticWait(1);
        newCustomerEntry.pin.sendKeys("123456");
     BrowserUtils.staticWait(1);
        newCustomerEntry.phone.sendKeys("123456789");
     BrowserUtils.staticWait(1);
        newCustomerEntry.email.sendKeys("sevgi2@gmail.com");
     BrowserUtils.staticWait(1);
        newCustomerEntry.password.sendKeys("123456");
     BrowserUtils.staticWait(1);
        newCustomerEntry.submit.click();

//    Step 7) Verify new customer added sucessfully

     WebElement customerText=DriverUtil.getDriver().findElement(By.xpath("//p[@class='heading3']"));

     System.out.println("customerText.isDisplayed() = " + customerText.isDisplayed());

     System.out.println("customerText.getText() = " + customerText.getText());


    }

}

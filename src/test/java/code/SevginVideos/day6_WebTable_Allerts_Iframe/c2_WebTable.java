package code.SevginVideos.day6_WebTable_Allerts_Iframe;

import code.SevginVideos.base.utilities.SmartBearUtils;
import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



    public class c2_WebTable {

        /*

        How do we handle web tables using Selenium webdriver?

	  -> We create specific xpath locators to locate what we want to get from the table itself.


      How do we handle web tables?
	- By creating custom locators to get whatever I need to get from the table.
	-> If I need to get the whole row, I create a locator that returns me the whole row.
	-> If I need to get 1 single cell, I need to create a locator that returns me 1 single cell.


      //table[@id='ctl00_MainContent_orderGrid']/tbody/tr

      //table[@id='ctl00_MainContent_orderGrid']//tr

         */
        ////*** How do you handle web tables?
        // ==> by creating custom locators to get whatever I need to get from the table
        //   * If I need to get whole row, I create a locator that returns me the whole row.
        //   * If I need to get 1 single cell, I need to create a locator that returns me 1 single cell.

        // ** //table[@id='........']/tbody/tr
        // ** //table[@id='........']/tr

        // ** //td[.='cardnumber']//..//td[6]
        // ** //td[.='Mark Smith']//following.sibling::td[4]


//    Smartbear software street verification
//       1. Open browser and login to Smartbear software
//       2. Click on View all orders
//       3. Verify Mark Smith has street as  “9, Maple Valley”

        WebDriver driver;

        @BeforeMethod
        public void setup(){
            //1- Open a chrome browser
            //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
            driver= WebDriverUtil.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

            //    //3- Login
            SmartBearUtils.loginForSmartBear(driver);
        }

        @Test
        public void TC1_verifyMarkStreetName(){
            //       2. Click on View all orders
            driver.findElement(By.linkText("View all orders")).click();
//       3. Verify Mark Smith has street as  “9, Maple Valley”

            // td[.='9, Maple Valley'] //if your data is unque you can use
            //td[.='770077007700']//..//td[6]
            ////td[.='Mark Smith']/following-sibling::td[4]

            WebElement markStreet=driver.findElement(By.xpath("//td[.='770077007700']//..//td[6]"));
            System.out.println("markStreet.getText() = " + markStreet.getText());

            String actualStreet=markStreet.getText();
            String expectedStreet="9, Maple Valley";

            Assert.assertEquals(actualStreet,expectedStreet,"street name verifaction has failed!!");

        }
    }



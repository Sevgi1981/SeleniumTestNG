package code.HasanLessons.day08_IframeAndNegaiveTest;

import code.HasanLessons.utilities.BrowserUtils;
import code.HasanLessons.utilities.SmartBearLoginUtils;
import code.HasanLessons.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_SmartBearNegativeTest {

    //1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3- enter incorrect username
//4- enter wrong password
//5- click login button
//6- verify error message displayed :Invalid Login or Password.

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


    }

    @AfterMethod
    public void closing(){
        BrowserUtils.staticWait(4);
        driver.close();

    }



    @Test(dataProvider = "loginCredentials")
    public void TC1NegativeTest(String userID, String passwordID) {

        SmartBearLoginUtils.negativeLoginForSmartBear(driver, userID, passwordID);
        //6- verify error message displayed :Invalid Login or Password.
//        WebElement StatusMessage=driver.findElement(By.id("ctl00_MainContent_status"));
//        Assert.assertEquals(StatusMessage.getText(),"Invalid Login or Password.");

        String actualTitle=driver.getTitle();
        String expectedTitle="Web Orders";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    //we create a dataprovider to have a small data library
    @DataProvider(name="loginCredentials")
    public static Object [] [] invalisUserCredentials() {

        return new Object [][]{

                {"Serdar","Kocan12"},
                {"Arion","Kocker45"},
                {"Yaseen","Alsakkaf_35"},
                {"Hasan", "Raman09"},
                {"Seray","Best.17"},
                {"Tester","test"}

        };
    }


}

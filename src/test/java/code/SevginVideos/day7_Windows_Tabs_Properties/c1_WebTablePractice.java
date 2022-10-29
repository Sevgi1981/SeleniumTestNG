package code.SevginVideos.day7_Windows_Tabs_Properties;

import code.SevginVideos.base.utilities.SmartBearUtils;
import code.SevginVideos.base.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_WebTablePractice {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test
    public void TC1_LoginVerification(){
        SmartBearUtils.loginForSmartBear(driver);
        Assert.assertEquals(driver.getTitle(),"Web Orders");
    }

    @Test
    public void TC2_streetVerification(){
        SmartBearUtils.loginForSmartBear(driver);
        //create a test that will check given street name and verify if it is presnet in the table
        //ex : given street name : 17, Park Avenue
        //result should passsed beacause it is present in the table
        //ex : wall street
        //result should fail . It is not present in the table

        //to locate all table ctl00_MainContent_orderGrid
        //table[@id='ctl00_MainContent_orderGrid']  to loacate all table
        //table[@id='ctl00_MainContent_orderGrid']//tr  to locate all 9 rows
        //table[@id='ctl00_MainContent_orderGrid']//tr[3] -- this will locate 3.row from table --1 row
        //table[@id='ctl00_MainContent_orderGrid']//tr//td[6]
        // -- this will locate each 6.td from each row so that is technically column 6
        ////table[@id='ctl00_MainContent_orderGrid']//tr[2]//td[2] from second row second data only one data

        SmartBearUtils.verifyStreet(driver,"17, Park Avenue");

    }
    @Test(dataProvider = "testDataForStreetName")
    public void TC3_streetVerification(String streetName){
        SmartBearUtils.loginForSmartBear(driver);
        SmartBearUtils.verifyStreet(driver,streetName);

    }

    //if ask you to verify for 4 different address
    @DataProvider(name = "testDataForStreetName")
    public static Object [][] test(){
        return new Object[][]{
                {"17, Park Avenue"},
                {"Hello world"},
                {"wall street"},
                {"7, Flower Street"}};

    }


}

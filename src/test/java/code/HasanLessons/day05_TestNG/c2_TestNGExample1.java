package code.HasanLessons.day05_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class c2_TestNGExample1 {

    @BeforeClass
    public void setupBeforeClass() {
        System.out.println("Before class is running");
    }

    @AfterClass
    public void setupAfterClass() {
        System.out.println("After class is running");
    }

    @BeforeMethod
    public void setup() {
        System.out.println(" Before method is running");

    }

    @AfterMethod
    public void closing() {
        System.out.println(" After method is running");
    }

    @Test(priority = 3)
    public void TC1(){
        System.out.println("test case 1 is running");
    }

    @Test(priority = 1)
    public void TC3(){
        System.out.println("test case 3is running");
        String actualName="Jason";
        String expectedName="Yaseen";
        Assert.assertEquals(actualName,expectedName);

        //when assertion fails,next line of code will not be executed
        System.out.println("Print actualName="+actualName);
    }

    @Test(priority = 2)
    public void TC2(){
        String actualCountry="USA";
        String expectedCountry="USA";
        Assert.assertEquals(actualCountry,expectedCountry);
        System.out.println("actual country is="+actualCountry);
    }
}


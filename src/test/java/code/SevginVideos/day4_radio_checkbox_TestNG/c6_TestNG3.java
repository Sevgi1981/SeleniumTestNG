package code.SevginVideos.day4_radio_checkbox_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class c6_TestNG3 {

    @BeforeClass
    public void setupClass(){ //this one will only run once before everyting in the class
        System.out.println("Before class is running");
    }
    @AfterClass
    public void setupAfterClass(){//this one will only run once after everyting in the class
        System.out.println("After class is running");
    }
    @BeforeMethod
    public void setup(){//this will run before each test annotation
        System.out.println("Before Method is running");
    }
    @AfterMethod
    public void closing(){//this will run after each test annotations
        System.out.println("After method is running");
    }

    @Test(priority = 3)
    public void TC1_test(){
        System.out.println("Test1 is running");
    }
    @Test(priority = 1)
    public void TC3_test(){
        System.out.println("Test3 is running");
        String actualword="hello";
        String expectedWord="hello2";

        Assert.assertEquals(actualword,expectedWord); // overloading
        System.out.println("continue test3");
    }

    @Test(priority = 2)
    public void TC2_test(){
        System.out.println("Test2 is running");
        String str="renastech";
        String str2="renastech";

        Assert.assertTrue(str.equals(str2));

    }
}

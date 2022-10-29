package code.HasanLessons.day05_TestNG;

import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.annotations.*;

public class c3_TestNGExample2 {

    @BeforeClass
    public void setupBeforeClass() {
        System.out.println("Before class is running");
    }

    @AfterClass
    public void setupAfterClass() {
        System.out.println("After class is running");
    }

    @BeforeMethod
    public void setup() { System.out.println(" Before method is running");}

    @AfterMethod
    public void closing() {
        System.out.println(" After method is running");
    }

    //TC1 is depends on TC3, if TC3 is fails, TC1 will be skipped
    @Test (priority = 3, dependsOnMethods = "TC3")
    public void TC1() {
        System.out.println("Test Case 1 is running");
    }
    @Test (priority = 1)
    public void TC3(){
        System.out.println("Test case 3 is running");
        int age=20;
        int expectedAge=25;
        Assert.assertEquals(age,expectedAge);
        System.out.println("Assertion for age is passed");
    }

    @Test(priority = 2)
    public void TC2(){
        System.out.println("Test Case 2 is running");
        String color="red";
        String expectedColor="red";
        Assert.assertEquals(color, expectedColor);

    }
    @Ignore
    @Test
    public void TC4() {
        System.out.println("Test Case 4 is running");
    }
}

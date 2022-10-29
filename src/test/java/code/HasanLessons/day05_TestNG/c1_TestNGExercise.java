package code.HasanLessons.day05_TestNG;

import org.testng.annotations.*;

public class c1_TestNGExercise {

    @BeforeClass
    public void setupBeforeClass() {
        System.out.println("before class is running");
    }

    @AfterClass
    public void setupAfterClass() {
        System.out.println("after class is running");
    }
    @BeforeMethod
    public void setup () {
        System.out.println(" Before method is running");

    }
    @AfterMethod
    public void closing() {
        System.out.println(" After method is running");
    }

    @Test
    public void TC1(){
        System.out.println("  Test1 is running");
    }
    @Test
    public void TC2() {
        System.out.println("  Test2 is running");
    }



}

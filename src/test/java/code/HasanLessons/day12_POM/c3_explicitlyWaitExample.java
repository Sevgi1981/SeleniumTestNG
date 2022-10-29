package code.HasanLessons.day12_POM;

import code.HasanLessons.Base.TestBase2;
import code.HasanLessons.pages.SeleniumPracticeHomePage;
import code.HasanLessons.utilities.DriverUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c3_explicitlyWaitExample extends TestBase2 {

    //go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    // click on timer
    // verify "WebDriver" text present
    @Test
    public void explicitlyWaitWithPOM(){
        DriverUtil.getDriver().get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        SeleniumPracticeHomePage seleniumPracticeHomePage=new SeleniumPracticeHomePage();
        seleniumPracticeHomePage.clickTimerButton();
        seleniumPracticeHomePage.getDefaultText();
        //verify that "WebDriver' text present
        String actualText=seleniumPracticeHomePage.getWebDriverText().getText();
        Assert.assertEquals(actualText,"WebDriver","WebDriver verification has failed");


    }
}

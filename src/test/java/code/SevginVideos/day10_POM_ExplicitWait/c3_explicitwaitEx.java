package code.SevginVideos.day10_POM_ExplicitWait;

import code.SevginVideos.Pages.SeleniumPracticeExplicitWaitPage;
import code.SevginVideos.base.TestBase2;
import code.SevginVideos.base.utilities.DriverUtil;
import code.SevginVideos.base.utilities.PropertiesReadingUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c3_explicitwaitEx extends TestBase2 {

    //go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    //click on timer
    //verify webdriver text gets present

    SeleniumPracticeExplicitWaitPage seleniumPracticeExplicitWaitPage; //null

    @Test
    public void tc1() {
        seleniumPracticeExplicitWaitPage = new SeleniumPracticeExplicitWaitPage();
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("selenium_practice_url"));
        //seleniumPracticeExplicitWaitPage.timerButton.click();
        seleniumPracticeExplicitWaitPage.getDefaultText();
        seleniumPracticeExplicitWaitPage.clickTimerButton();
        seleniumPracticeExplicitWaitPage.getDefaultText();
        //BrowserUtils.wait(5);
        WebElement actualText = seleniumPracticeExplicitWaitPage.getWebDriverText();
        seleniumPracticeExplicitWaitPage.getDefaultText();

        Assert.assertEquals(actualText.getText(), "WebDriver", "Webdriver text is not present on the page!!");
    }


    //we extend TestBase2 with logic of inheritence
    //we get before and after method
    //we create page class SeleniumPracticeExplicitWaitPage
    //and we stored webelements that we need to be able to do testing and some usefull methods
    //create an object from page to be able to call webelements and methods
    //you navigate your url with using properties file and properties util
    //then you click on timer
    //then you waited until webdriver text to be present
    //then verify your text was present


}

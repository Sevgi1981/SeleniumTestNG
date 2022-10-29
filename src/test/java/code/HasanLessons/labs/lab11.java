package code.HasanLessons.labs;

import code.HasanLessons.Base.TestBase2;
import code.HasanLessons.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lab11 extends TestBase2 {

    /*
    Task 2:
    //go to http://the-internet.herokuapp.com/hovers
    //move mouse to third image(you may use move to element method in actions)
    //verify text of image present on the screen
     */

    @Test
    public void TC1(){

        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/hovers");

        WebElement thirdimage= DriverUtil.getDriver().findElement(By.xpath("//h5[.='name: user3']/../preceding-sibling::img"));

        Actions actions=new Actions(DriverUtil.getDriver());

        actions.moveToElement(thirdimage).perform();

        WebElement ImageText= DriverUtil.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        boolean testIsPresent=ImageText.isDisplayed();
        Assert.assertTrue(testIsPresent,"text is not present");

    }


}

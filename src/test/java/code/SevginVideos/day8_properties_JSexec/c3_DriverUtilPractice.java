package code.SevginVideos.day8_properties_JSexec;

import code.SevginVideos.base.utilities.DriverUtil;
import code.SevginVideos.base.utilities.PropertiesReadingUtil;
import code.SevginVideos.base.TestBase2;
import code.SevginVideos.base.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c3_DriverUtilPractice extends TestBase2 {

    //go to google
    //search for hello
    //veriffy title contains helllo
    @Test
    public void Tc1_practice(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));

        WebElement searchBox=DriverUtil.getDriver().findElement(By.name("q"));

        String searchItem=PropertiesReadingUtil.getProperties("google_searchData");
        searchBox.sendKeys(searchItem + Keys.ENTER);
        //veriffy title contains helllo

        BrowserUtils.wait(2);
        System.out.println("DriverUtil.getDriver().getTitle() = " + DriverUtil.getDriver().getTitle());
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(searchItem));
    }

}
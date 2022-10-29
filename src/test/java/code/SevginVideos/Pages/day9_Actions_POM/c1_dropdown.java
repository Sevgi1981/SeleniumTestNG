package code.SevginVideos.Pages.day9_Actions_POM;

import code.SevginVideos.base.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class c1_dropdown {

    @Test
    public void TC1_test(){
        DriverUtil.getDriver().get("https://exchange.sandbox.gemini.com/register/institution");
        WebElement dropdownBox=DriverUtil.getDriver().findElement(By.id("countryDropdown"));

        dropdownBox.sendKeys("Cuba");
        dropdownBox.sendKeys(Keys.ARROW_DOWN);
        dropdownBox.sendKeys(Keys.ENTER);

    }
}

package code.SevginVideos.day11_xmlFiles;

import code.SevginVideos.base.TestBase2;
import code.SevginVideos.base.utilities.DriverUtil;
import org.testng.annotations.Test;

public class googlletest extends TestBase2 {
    //verify title is changed after you click gmail button


    @Test
    public void test(){
        DriverUtil.getDriver().get("https://www.google.com");
    }


    //we extend TestBase2 with logic of inheritence
    //we get before and after method
    //we create page class googlemainpage
    //and we stored webelements : such as gmail button  that we need to be able to do testing
    // and some usefull methods : getTitle  , clickGmailButton
    //create an object from page to be able to call webelements and methods

    //test class
    //you navigate your url with using properties file and properties util
    //then you click on gmail button
    //then you get title
    //then verify title changed with assert


}
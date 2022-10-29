package code.SevginVideos.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearLoginPage extends BasePage {

    //2. @FindBy annotation to locate webElements.
    //		-> Using this FindBy annotation, help us to locate web elements.
    //3. Create methods related webelements

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameBox; //you assigned id locater to this weblement

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_status")
    private WebElement statusMassege;

    //if this is priavate you wont have access from outside
    //you will need create some methods to be able to use it

    //    //3. Create methods related webelements
    public void loginSmartBear(String username,String password){
        //either you can also assign your username and password from properties file
        //or just from coling the method

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

    }
    public WebElement getStatusMassageElement(){
        return statusMassege;
    }

    public String getStatusMessage(){
        return statusMassege.getText();
    }




}
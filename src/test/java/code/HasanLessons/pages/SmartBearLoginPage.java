package code.HasanLessons.pages;

/*
    IN POM Design you need to have some structure for each page :
    1.PageFactory.initElements(driver, this);
      -> It creates connection in between driver and object of the class.
    2. @FindBy annotation to locate webElements.
      -> Using this FindBy annotation, help us to locate web elements.
    3. Create methods related webelements
     */


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SmartBearLoginPage extends BasePage {

    @FindBy(id="ctl00_MainContent_username")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$password']")
    public WebElement passwordBox;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id="ctl00_MainContent_status")
    private WebElement statusMessage;



    public void loginSmartBear(String username, String password){

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();



    }

    public String getStatusMessage(){

        return statusMessage.getText();
    }

}

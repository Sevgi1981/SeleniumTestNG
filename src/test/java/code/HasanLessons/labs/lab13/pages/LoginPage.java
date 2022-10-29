package code.HasanLessons.labs.lab13.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage1 {

    //2. @FindBy annotation to locate webElements.
    //		-> Using this FindBy annotation, help us to locate web elements.
    //3. Create methods related webelements

    @FindBy(xpath = "//input[@name='uid']")
    public WebElement usernameID;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@name='btnLogin']")
    public WebElement loginButton;


    //if this is priavate you wont have access from outside
    //you will need create some methods to be able to use it

    //    //3. Create methods related webelements
    public void loginGuruMethod(String username,String password){
        //either you can also assign your username and password from properties file
        //or just from coling the method

        usernameID.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

    }

    @FindBy(xpath = "//h2[class='barone']")
    private WebElement statusMessage;

    public WebElement getStatusMassageElement(){
        return statusMessage;
    }

    public String getStatusMessage(){
        return statusMessage.getText();
    }




}
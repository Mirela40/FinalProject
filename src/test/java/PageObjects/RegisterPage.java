package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    @FindBy (xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy (xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy (xpath = "//*[@id=\"username\"]")
    private WebElement userNameField;

    @FindBy (xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;

    @FindBy (xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordField;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement RegisterPageText;

    public String next_button() {return nextButton.getText();}

    public String RegisterPage_text()  { return RegisterPageText.getText();}

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void insertFirstNameField(String string) {
        firstNameField.sendKeys(string);
    }

    public void insertLastNameField(String string){
        lastNameField.sendKeys(string);
    }


    public void insertUsernameField(String string) {
        userNameField.sendKeys(string);
    }

    public void insertPasswordField(String string) {
        passwordField.sendKeys(string);
    }

    public void insertConfirmPasswordField(String string) {
        confirmPasswordField.sendKeys(string);
    }

    public void clickOnNextButton() {
        nextButton.click();
    }

    public void fillInRegisterPage() {
        insertFirstNameField("Test");
        insertLastNameField("Test");
        insertUsernameField("Test");
        insertPasswordField("Test");
        insertConfirmPasswordField("Test");
        clickOnNextButton();
    }
}


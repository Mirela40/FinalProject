package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationPage {

    public PaymentInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement CardHolderName;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement CardNumber;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement CVC;

    @FindBy (xpath = "//*[@id=\"month\"]/option[6]")
    private WebElement Month;

    @FindBy (xpath = "//*[@id=\"year\"]/option[8]")
    private WebElement Year;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement PaymentInformationText;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement RegistrationText;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextButton;

    public String Registration_tex() { return RegistrationText.getText();}

    public String PaymentInformation_text() { return PaymentInformationText.getText();}

    public void insertCardHolderName(String string) { CardHolderName.sendKeys(string);}

    public void insertCardNumber(String string) { CardNumber.sendKeys(string);}

    public void insertCVC(String string) { CVC.sendKeys(string);}

    public void insertMonth() { Month.click();}

    public void insertYear() { Year.click(); }

    public void clickOnNextButton() {
        nextButton.click();
    }

}

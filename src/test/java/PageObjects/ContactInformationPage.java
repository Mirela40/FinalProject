package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {
    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement emailAddressField;

    @FindBy (xpath = "//*[@id=\"phone\"]")
    private WebElement phoneNumber;

    @FindBy (xpath = "//*[@id=\"country\"]")
    private WebElement countryName;

    @FindBy (xpath = "//*[@id=\"city\"]")
    private WebElement cityName;

    @FindBy (xpath ="//*[@id=\"postCode\"]")
    private WebElement postCode;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement ContactInformationText;

    @FindBy (xpath ="/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButton;

    public String ContactInformation_text() { return ContactInformationText.getText();}

    public ContactInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void insertEmailAddress(String string) { emailAddressField.sendKeys(string);
    }
    public void insertPhoneNumber(String string) { phoneNumber.sendKeys(string);
    }
    public void insertCountryName(String string) { countryName.sendKeys(string);
    }
    public void insertCityName(String string) { cityName.sendKeys(string);
    }
    public void insertPostCode(String string) { postCode.sendKeys(string);}

    public void clickOnNextButton() {
        nextButton.click();
    }

    public void fillInContactInformation() {
        insertEmailAddress("Test");
        insertPhoneNumber("Test");
        insertCityName("Test");
        insertCountryName("Test");
        insertPostCode("Test");
        clickOnNextButton();
    }
}

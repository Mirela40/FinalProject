package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy (xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement inputEmailField;
    @FindBy (xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement elementSubmitButton;

    @FindBy (xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement elementReadMoreButtonSelenium;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/h2")
    private WebElement seleniumHeader;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement fundamentalsHeader;

    @FindBy (xpath = "/html/body/footer/div/a/i")
    private WebElement elementReturnToTheTopButton;

    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorsButton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement readMoreVirtualButton;
    @FindBy (xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startTheEnrollmentButton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement readMoreHybridButton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement readMoreInPersonButton;

    @FindBy (xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement readMoreLearnTheFundamentalsButton;

    @FindBy (xpath = "/html/body/section[1]/div/div/div/h1/span")
    private WebElement backToTheTopText;

    @FindBy (xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement submitText;

    @FindBy (xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement ourInstructorsText;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualHeaderText;

    public String submit_text() { return submitText.getText();}

    public String backToTheTop_text() { return backToTheTopText.getText();}

    public String ourInstructors_text() { return ourInstructorsText.getText();}

    public WebElement getVirtualHeader () {
        return virtualHeaderText;
    }


    public WebElement getFundamentalsHeader() {
        return fundamentalsHeader;
    }

    public MainPage(WebDriver driver) {PageFactory.initElements(driver, this);
    }

    public void inputValueInEmailField(String string) {inputEmailField.sendKeys(string);
    }
    public void clickOnSubmitButton() {elementSubmitButton.click();
    }


    public WebElement getSeleniumHeader() {
        return seleniumHeader;
    }

    public void clickOnInstructorsButton() {instructorsButton.click();}

    public void clickOnReadMoreButtonSelenium() { elementReadMoreButtonSelenium.click();
    }

    public void clickOnReturnToTheTopButton() { elementReturnToTheTopButton.click();
    }

    public void clickOnReadMoreInPersonButton() { readMoreInPersonButton.click();}

    public void clickOnStartTheEnrollmentButton() { startTheEnrollmentButton.click();
    }

    public void clickOnLearnTheFundamentalsButton() { readMoreLearnTheFundamentalsButton.click();}

    public void clickReadMoreHybrid() { readMoreHybridButton.click();
    }


    public void clickOnReadMoreVirtual() { readMoreVirtualButton.click();

    }

}


package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationCompleted {

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement RegistrationText;

    public RegistrationCompleted(WebDriver driver) { PageFactory.initElements(driver, this);
    }
    public String Registration_text() { return RegistrationText.getText();}
}

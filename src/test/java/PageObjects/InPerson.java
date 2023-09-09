package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InPerson {

    @FindBy (xpath = "/html/body/section[3]/div/div/div[3]/div/div/h3")
    private WebElement InPersonHeader;

    public InPerson(WebDriver driver) { PageFactory.initElements(driver, this);}

    public String InPersonHeader() { return InPersonHeader.getText();}
}

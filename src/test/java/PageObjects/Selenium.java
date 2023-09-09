package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenium {
    @FindBy(xpath = "/html/body/a")
    private WebElement seleniumHeader;

    public Selenium(WebDriver driver) { PageFactory.initElements(driver, this);
    }
    public String seleniumHeader() { return seleniumHeader.getText();}
}

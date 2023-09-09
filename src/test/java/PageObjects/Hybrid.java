package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hybrid {
    @FindBy(xpath = "/html/body/a")
    private WebElement hybridHeader;


    public Hybrid(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String hybridHeader() {
        return hybridHeader.getText();
    }
}
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Virtual {
    @FindBy (xpath = "/html/body/a")
    private WebElement virtualHeader;

    public Virtual(WebDriver driver) {PageFactory.initElements(driver, this);
    }

    public String getVirtualHeaderText() {
        return virtualHeader.getText();
    }
}

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnTheFundamentals {

    @FindBy (xpath = "/html/body/h1")
    private WebElement learnTheFundamentalsHeader;

    public LearnTheFundamentals(WebDriver driver) {PageFactory.initElements(driver, this);}

    public String learnTheFundamentalsHeader() { return learnTheFundamentalsHeader.getText();}
}

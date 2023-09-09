package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOptionPage {


    public CourseOptionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//*[@id=\"flexRadioButton1\"]")
    private WebElement SoftwareTestingManualTesterCertificate;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement CourseOptionText;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement nextButton;

    public String CourseOption_text() { return CourseOptionText.getText();}

    public void getSoftwareTestingManualTesterCertificate()
    { SoftwareTestingManualTesterCertificate.click();}

    public void clickOnNextButton() {
        nextButton.click();
    }

    public void fillInCourseOptions() {
        getSoftwareTestingManualTesterCertificate();
        clickOnNextButton();
    }



}

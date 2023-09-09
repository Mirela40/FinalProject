package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {
    private WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    MainPage mainPage;

    Hybrid Hybrid;
    Virtual Virtual;
    InPerson InPerson;
    Selenium selenium;
    LearnTheFundamentals learnTheFundamentals;
    RegisterPage registerPage;
    ContactInformationPage contactInformationPage;
    CourseOptionPage courseOptionPage;
    PaymentInformationPage paymentInformationPage;
    RegistrationCompleted registrationCompleted;
    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        Hybrid = new Hybrid(driver);
        Virtual = new Virtual(driver);
        InPerson = new InPerson(driver);
        selenium = new Selenium(driver);
        registerPage = new RegisterPage(driver);
        contactInformationPage = new ContactInformationPage(driver);
        courseOptionPage = new CourseOptionPage(driver);
        paymentInformationPage = new PaymentInformationPage(driver);
        learnTheFundamentals = new LearnTheFundamentals(driver);
        registrationCompleted = new RegistrationCompleted(driver);
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/vasil/Documents/Testing-Env-master%20(2)/Testing-Env-master/index.html");
    }

    @Given("I am on the main page promotional section")
    public void i_am_on_the_main_page_promotional_section() {
        driver.get("file:///C:/Users/vasil/Documents/Testing-Env-master%20(2)/Testing-Env-master/index.html#");
    }

    @Given("I am on the enrollment page")
    public void iAmOnTheEnrollmentPage() {
        driver.get("file:///C:/Users/vasil/Documents/Testing-Env-master%20(2)/Testing-Env-master/routes/enrollment.html");
    }

    @Given("I am on the Register page")
    public void i_am_on_the_register_page() {
        driver.get("file:///C:/Users/vasil/Documents/Testing-Env-master%20(2)/Testing-Env-master/routes/enrollment.html");
    }

    @Given("I am on the Contact Information page")
    public void i_am_on_the_contact_information_page() {
        driver.get("file:///C:/Users/vasil/Documents/Testing-Env-master%20(2)/Testing-Env-master/routes/enrollment.html");
        registerPage.fillInRegisterPage();
    }
    @Given("I am on the Course Option page")
    public void i_am_on_the_course_option_page() {
        driver.get("file:///C:/Users/vasil/Documents/Testing-Env-master%20(2)/Testing-Env-master/routes/enrollment.html");
        registerPage.fillInRegisterPage();
        contactInformationPage.fillInContactInformation();
    }

    @Given("I am on the Payment Information page")
    public void i_am_on_the_payment_information_page() {
        driver.get("file:///C:/Users/vasil/Documents/Testing-Env-master%20(2)/Testing-Env-master/routes/enrollment.html");
        registerPage.fillInRegisterPage();
        contactInformationPage.fillInContactInformation();
        courseOptionPage.fillInCourseOptions();
    }

    @When("the read more button Selenium is clicked")
    public void click_on_read_more_selenium_button() {
        Utils.scrollToElement(driver, mainPage.getSeleniumHeader());
        mainPage.clickOnReadMoreButtonSelenium();
    }

    @When("the return to the top button is clicked")
    public void click_on_return_to_the_top_button() {
        mainPage.clickOnReturnToTheTopButton();
    }

    @When("the email value of {string} is inputted")
    public void input_email_to_field(String string) {
        mainPage.inputValueInEmailField(string);
    }


    @When("the Virtual Read More button is clicked")
    public void click_virtual_read_more_button() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickOnSubmitButton();}

    @When("I click on Instructors button")
    public void iClickOnInstructorsButton() { mainPage.clickOnInstructorsButton();}

    @When("I click the read more button for the virtual section")
    public void iClickTheReadMoreButtonForTheVirtualSection() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader () );
        mainPage.clickOnReadMoreVirtual();}

    @When("the In Person Read More button is clicked")
    public void click_in_person_read_more_button () {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickOnReadMoreInPersonButton();
    }

    @When("Learn the Fundamentals read more button is clicked")
    public void click_on_learn_the_fundamentals_read_more_button () {
        Utils.scrollToElement(driver, mainPage.getFundamentalsHeader() );
        mainPage.clickOnLearnTheFundamentalsButton();
    }

    @When("start The Enrollment button is clicked")
    public void click_start_the_enrollment_button () {
        mainPage.clickOnStartTheEnrollmentButton();
    }

    @When("the first name is inserted as {string}")
    public void insert_first_name (String string) {
        registerPage.insertFirstNameField(string);
    }

    @When("the Software Testing Manual Tester Certificate is clicked")
    public void theSoftwareTestingManualTesterCertificate () {
        courseOptionPage.getSoftwareTestingManualTesterCertificate();
    }

    @When("the card holder name is set to {string}")
    public void insertCardHolderName (String string) {
        paymentInformationPage.insertCardHolderName(string);
    }

    @And("the submit button is clicked")
    public void the_submit_button_is_clicked () {
        mainPage.clickOnSubmitButton();
    }


    @And("the last name is inserted as {string}")
    public void insert_last_name (String string){
        registerPage.insertLastNameField(string);
    }

    @When("the username is inserted as {string}")
    public void insert_username (String string){
        registerPage.insertUsernameField(string);
    }

    @And("the password is inserted as {string}")
    public void insert_password (String string){
        registerPage.insertPasswordField(string);
    }

    @And("the confirm password is inserted as {string}")
    public void insert_confirm_password (String string){
        registerPage.insertConfirmPasswordField(string);
    }


    @When("I click the read more button for virtual page")
    public void iClickTheReadMoreButtonForVirtualPage () {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickOnReadMoreVirtual();
        }

    @When("I click the read more button for the hybrid section")
    public void iClickTheReadMoreButtonForTheHybridSection () {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickReadMoreHybrid();}

    @When("the email address is inserted as {string}")
    public void insert_email_address (String string) {
        contactInformationPage.insertEmailAddress(string);
    }

    @And("the phone number is inserted as {string}")
    public void insert_phone_number (String string) {
        contactInformationPage.insertPhoneNumber(string);
    }

    @And("the country is inserted as {string}")
    public void insert_country (String string) {
        contactInformationPage.insertCountryName(string);
    }

    @And("the city name is inserted as {string}")
    public void insert_city (String string) {
        contactInformationPage.insertCityName(string);
    }

    @And("the post code is inserted as {string}")
    public void insert_post_code (String string) {
        contactInformationPage.insertPostCode(string);
    }

    @And("the card number is inserted {string}")
    public void insert_card_number (String string) {
        paymentInformationPage.insertCardNumber(string);
    }

    @And("the CVC is inserted {string}")
    public void insertCVC (String string) {
        paymentInformationPage.insertCVC(string);
    }

    @And("the month is inserted")
    public void insert_month () { paymentInformationPage.insertMonth();}

    @And("the year is inserted")
    public void insert_year () { paymentInformationPage.insertYear();}

    @Then("I can click on next")
    public void iCanClickOnNext () { registerPage.clickOnNextButton();}

    @Then("the hybrid page opens")
    public void theHybridPageOpens () {
         Assertions.assertEquals("Hybrid", Hybrid.hybridHeader());
    }

    @Then("the Virtual page opens")
    public void theVirtualPageOpens () {
        Assertions.assertEquals("Virtual", Virtual.getVirtualHeaderText());
    }

    @Then("the Selenium page opens")
    public void theSeleniumPageOpens () { Assertions.assertEquals("Selenium", selenium.seleniumHeader());}

    @Then("our Instructors options appear")
    public void ourInstructorsOptionsAppear () {Assertions.assertEquals("Our Instructors", mainPage.ourInstructors_text());}

    @Then("the newsletter confirmation pop-up appears")
    public void theNewsletterConfirmationPopUpAppears () {
         driver.switchTo().alert().accept();
    }

    @Then("I am not allowed to click on next")
    public void iAmNotAllowedToClickOnNext () {Assertions.assertEquals("Personal information", registerPage.RegisterPage_text());}

    @Then("the In Person page opens")
    public void theInPersonPageOpens () {
        Assertions.assertEquals("In Person Page", InPerson.InPersonHeader());}

    @Then("I return back to the top page")
    public void iReturnBAckToTheTopPage () {
        Assertions.assertEquals("Back to the top", mainPage.backToTheTop_text());}

    @Then("the Register page opens")
    public void theRegisterPageOpens () {
        Assertions.assertEquals("Register Page", registerPage.RegisterPage_text());}

    @Then("the Contact Information page opens")
    public void theContactInformationPageOpens () {
        Assertions.assertEquals("Contact information", contactInformationPage.ContactInformation_text());}

    @Then("the Course Options page opens")
    public void theCourseOptionsPageOpens () {
        Assertions.assertEquals("Course options", courseOptionPage.CourseOption_text());}

    @Then("Learn the Fundamentals page opens")
    public void learnTheFundamentalsPageOpens () {
        Assertions.assertEquals ("Fundamentals page", learnTheFundamentals.learnTheFundamentalsHeader());}

    @Then("Payment Information page open")
    public void paymentInformationPageOpen () {
        Assertions.assertEquals("Payment Information",paymentInformationPage.PaymentInformation_text());}

    @Then("the registration should be completed")
    public void theRegistrationShouldBeCompleted () {
        Assertions.assertEquals("Success!", registrationCompleted.Registration_text());}

    @Then("the email border goes red")
    public void iAmNotAllowedToClickOnSubmit () {
        Assertions.assertTrue(driver.getPageSource().contains("error"));}

    @Then("next button for contact information is clicked")
    public void nextBtnContactInfo () {
        contactInformationPage.clickOnNextButton();
    }

    @Then("the next button is clicked for payment information")
    public void nextBtnPaymentInfo () {
        paymentInformationPage.clickOnNextButton();
    }

    @After
    public void cleanUp() {
        driver.quit();
    }
}
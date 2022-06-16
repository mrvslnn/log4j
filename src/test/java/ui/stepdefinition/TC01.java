package ui.stepdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import ui.pages.TC01Pages;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;
import ui.utilities.Log;
import ui.utilities.ReusableMethod;

public class TC01 {
    TC01Pages pages = new TC01Pages();
    ReusableMethod waitFor = new ReusableMethod();
    Faker faker=new Faker();
    Logger log=(Logger) LogManager.getLogger(TC01.class);
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("Navigate to url")
    public void navigate_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        log.info("anasayfaya girildi");
        //Log.startTestCase("automation exercise testi");
    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        js.executeScript("window.scrollBy(0,9000)");//x ve y miktarınca kaydır..9000 pixel aşağı gönderdik
        waitFor.wait(5000);
        js.executeScript("window.scrollBy(0,-9000)");//-9000 pixel yukarı gönderdik
        Assert.assertTrue(pages.homePage.isDisplayed());
       log.info("basarili giris yapildigi dogurlnadi");
       // Log.info("anasaysaya girildigi dogurlmnadi");
    }
    @Then("Click on Signup Login button")
    public void click_on_signup_login_button() {
        pages.signUp.click();

    }
    @Then("Verify New User Signup is visible")
    public void verify_new_user_signup_is_visible() {
        Assert.assertTrue(pages.newSignUp.isDisplayed());
        js.executeScript("window.scrollBy(0,500)");//2000 pixel yukarı gönderdik
        waitFor.wait(2000);
    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        String email = faker.internet().emailAddress();
        pages.nameUse.sendKeys("Ahmet");
        pages.emailUse.sendKeys(email);//Faker Class tan alalım
        pages.signUpClick.click();
        js.executeScript("window.scrollBy(0,500)");//500 pixel aşağı gönderdik
        Assert.assertTrue(pages.enterAccountInformation.isDisplayed());
        pages.mR.click();
        pages.passWordEmail.sendKeys("54321Eca.");
    }
    @Then("Select checkbox Sign up for our newsletter")
    public void select_checkbox_sign_up_for_our_newsletter() {
        ReusableMethod.selections(pages.selectDays);
        ReusableMethod.selections(pages.selectMoths);
        ReusableMethod.selections(pages.selectYears);
        pages.selectNewletter.click();
        pages.selectPartners.click();
    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        js.executeScript("window.scrollBy(0,300)");//300 pixel aşağı gönderdik
        pages.firstName.sendKeys("Ahmet");
        pages.lastName.sendKeys("Can");
        pages.companyName.sendKeys("WowGroup");
        pages.address1.sendKeys("Filedelfia");
        pages.address2.sendKeys("Canada");
        ReusableMethod.selections(pages.country);
        pages.state.sendKeys("Oclawa");
        waitFor.wait(2000);
        pages.city.sendKeys("Moclawa");
        pages.zipcode.sendKeys("Qurol123");
        pages.mobile_number.sendKeys("123-45-4544");
    }
    @Then("Click Create Account button")
    public void click_create_account_button() {
        pages.creatAccount.click();
    }
    @Then("Verify that ACCOUNT CREATED is visible")
    public void verify_that_account_created_is_visible() {
        js.executeScript("window.scrollBy(0,200)");//300 pixel aşağı gönderdik
        Assert.assertTrue(pages.accountCreated.isDisplayed());
        System.out.println(pages.accountCreated.getText());
        waitFor.wait(2000);
       log.info("create account tiklandi");
       // Log.info("create account butonuna tiklnadi");
    }

    @Then("Click Continue button")
    public void click_continue_button() {
        pages.continue01.click();
    }

    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(pages.loggedIn.isDisplayed());
        waitFor.wait(2000);
       log.info("continue butonuna tiklandi");
        //Log.info("continue butonuna tiklandi");
    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {
        pages.deleteButton.click();
        Assert.assertTrue(pages.deleteAcount.isDisplayed());
        System.out.println(pages.deleteAcount.getText());
        //Log.endTestCase("automation exercise");
    }

}

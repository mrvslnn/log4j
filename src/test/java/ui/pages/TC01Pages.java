package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

public class TC01Pages {
    public TC01Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//i[@class='fa fa-home']")
    public WebElement homePage;

    @FindBy (xpath = "//ul//li[4]/a")
    public WebElement signUp;

    @FindBy (xpath = "//div[@class='signup-form']/h2")
    public WebElement newSignUp;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    public WebElement nameUse;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    public WebElement emailUse;

    @FindBy (xpath = "(//button[@class='btn btn-default'])[2]")
    public WebElement signUpClick;

    @FindBy (xpath = "//div[@class='col-sm-4 col-sm-offset-1']/div/h2")
    public WebElement enterAccountInformation;

    @FindBy (id = "uniform-id_gender1")
    public WebElement mR;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement passWordEmail;

    @FindBy (xpath = "(//select[@class='form-control'])[1]")
    public WebElement selectDays;

    @FindBy (id = "months")
    public WebElement selectMoths;

    @FindBy (id = "years")
    public WebElement selectYears;

    @FindBy (id = "newsletter")
    public WebElement selectNewletter;

    @FindBy (id = "optin")
    public WebElement selectPartners;

    @FindBy (id = "first_name")
    public WebElement firstName;

    @FindBy (id = "last_name")
    public WebElement lastName;

    @FindBy (id = "company")
    public WebElement companyName;

    @FindBy (id = "address1")
    public WebElement address1;

    @FindBy (id = "address2")
    public WebElement address2;

    @FindBy (id = "country")
    public WebElement country;

    @FindBy (id = "state")
    public WebElement state;

    @FindBy (xpath = "(//input[@class='form-control'])[10]")
    public WebElement city;

    @FindBy (id = "zipcode")
    public WebElement zipcode;

    @FindBy (id = "mobile_number")
    public WebElement mobile_number;

    @FindBy (xpath = "(//button[@class='btn btn-default'])[1]")
    public WebElement creatAccount;

    @FindBy (xpath = "//h2[@class='title text-center']")
    public WebElement accountCreated;

    @FindBy (xpath = "//a[@class='btn btn-primary']")
    public WebElement continue01;

    @FindBy (xpath = "//ul[@class='nav navbar-nav']//li[9]")
    public WebElement loggedIn;

    @FindBy (xpath = "(//a[@style='color:brown;'])[2]")
    public WebElement deleteButton;

    @FindBy (xpath = "//h4[@class='text-center']")
    public WebElement deleteAcount;

    @FindBy (xpath = "//*[text()='Login to your account']")
    public WebElement logInAccountText;

    @FindBy (xpath = "(//input[@placeholder='Email Address'])[1]")
    public WebElement emailAddress02;

    @FindBy(xpath = "//form//button[1]")
    public WebElement logInButton;

    @FindBy (xpath = "(//ul//li[4])[1]")
    public WebElement logOutButton;

    @FindBy (xpath = "//h2[@class='or']")
    public WebElement oRoROr;
}

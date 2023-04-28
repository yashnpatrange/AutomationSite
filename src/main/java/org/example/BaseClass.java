package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BaseClass extends AbstractPage{

    //calling constructor from parent AbstractPage class
    protected BaseClass(WebDriver driver) {
        super(driver);
    }

    //Locators
    static final String LogSignIn= ".//a[@href='/login']";
    static final String LogInButton= "//form/button[@data-qa='login-button']";
    static final String ProductBtn = "//a[@href='/products']";
    static final String CatMen= "//a[@href='#Men']";
    static final String CatJeans="//a[@href='/category_products/6']";



    //Objects
    @FindBy(how= How.XPATH, using = LogSignIn)
    private WebElement logSignInBtn;
    @FindBy(xpath = "//form/input[@data-qa='login-email']")
    private WebElement emailId;
    @FindBy(xpath = "//form/input[@data-qa='login-password']")
    private WebElement password;
    @FindBy(how= How.XPATH, using = LogInButton)
    private WebElement logInButton;
    @FindBy(how= How.XPATH, using = ProductBtn)
    private WebElement productBtn;
    @FindBy(how= How.XPATH, using = CatMen)
    private WebElement catMen;
    @FindBy(how= How.XPATH, using = CatJeans)
    private WebElement catJeans;



    //methods to perform actions
    public void clickToSingIn(){
        logSignInBtn.click();
    }
    public void enterEmail(String text){
        emailId.sendKeys(text);
    }
    public void enterPassword(String text){
        password.sendKeys(text);
    }
    public void ClickLoginBtn(){
        logSignInBtn.click();
    }
    public void ClickProductBtn(){
        productBtn.click();
    }
    public void ClickCatMen(){
        catMen.click();
    }
    public void ClickCatJeans(){
        catJeans.click();
    }


}

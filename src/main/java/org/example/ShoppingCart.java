package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCart extends AbstractPage {

    //calling constructor from parent AbstractPage class
    protected ShoppingCart(WebDriver driver) {
        super(driver);
    }

    //Locators
    static final String ViewProduct= "//a[@href='/product_details/2']";
    static final String ProceedBtn= "//a[@class='btn btn-default check_out']";
    static final String AddToCart= "//button[@class='btn btn-default cart']";
    static final String ViewCart= "//a[@href='/view_cart']";
    static final String RegisterLink ="//a[@href='/login']";

    //Objects
    @FindBy(how= How.XPATH, using = ViewProduct)
    private WebElement viewProduct;
    @FindBy(how= How.XPATH, using = AddToCart)
    private WebElement addToCart;
    @FindBy(how= How.XPATH, using = ViewCart)
    private WebElement viewCart;
    @FindBy(how= How.XPATH, using = ProceedBtn)
    private WebElement proceedBtn;
    @FindBy(how= How.XPATH, using = RegisterLink)
    private WebElement registerLink;


    //methods to perform actions
    public void ViewProductBtn(){
        viewProduct.click();
    }
    public void ClickAddToCart(){
        addToCart.click();
    }
    public void ViewCartLink(){
        viewCart.click();
    }
    public void ClickProceedBtn(){
        proceedBtn.click();
    }
    public void ClickRegisterLink(){
        registerLink.click();
    }
}

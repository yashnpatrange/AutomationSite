package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchProducts extends AbstractPage{
    //calling constructor from parent AbstractPage class
    protected SearchProducts(WebDriver driver) {
        super(driver);
    }
    //Locators
    static final String ViewProduct= "//a[@href='/product_details/2']";

    //Objects
    @FindBy(how= How.XPATH, using = ViewProduct)
    private WebElement viewProduct;

    //methods to perform actions
    public void ViewProductBtn(){
        viewProduct.click();
    }
}

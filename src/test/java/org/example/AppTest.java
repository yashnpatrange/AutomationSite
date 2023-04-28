package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;


public class AppTest {

    public static WebDriver driver;


    @BeforeEach
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("./bin/1.49.2_0.crx"));
        driver = new ChromeDriver(options);

//        EdgeOptions options = new EdgeOptions();
//        options.addExtensions(new File("./bin/1.49.2_0.crx"));
//        driver = new EdgeDriver(options);

    }
    @AfterEach
    public void cleanUp(){
        driver.quit();}

    //method to run tests
    @Test
    public void myTest()  {
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();

        //calling method to test from BaseClass
        BaseClass baseClass= new BaseClass(driver);
        baseClass.clickToSingIn();
        baseClass.enterEmail("john@qac.cmo");
        baseClass.enterPassword("Test@123");
        baseClass.ClickLoginBtn();
        //Thread.sleep(1000);
    }

    @Test
    public void Test_1(){ //To add Product in cart
        driver.get("https://www.automationexercise.com/products");
        driver.manage().window().maximize();
        BaseClass obj= new BaseClass(driver);

    }

    @Test
    public void Test_2(){ //To proceed for checkout
        driver.get("https://www.automationexercise.com/products");
        //driver.manage().window().maximize();
        ShoppingCart obj1= new ShoppingCart(driver);
        obj1.ViewProductBtn();
        obj1.ClickAddToCart();
        obj1.ViewCartLink();
        obj1.ClickProceedBtn();
        obj1.ClickRegisterLink();
    }
}

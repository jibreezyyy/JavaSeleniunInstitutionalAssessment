package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ECommerceTest {
    WebDriver driver;
    HomePage home;
    ProductPage product;
    CartPage cart;

    

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://www.amazon.com/");
        // driver.get("https://www.amazon.com/s?k=keyboard&ref=nb_sb_noss_2");
   }
    
    @Test
    public void Homepage() throws InterruptedException{
        home = new HomePage(driver);
        home.search("keyboard");
        home.button();
        Thread.sleep(2000);
        


    }
    @Test(dependsOnMethods = "Homepage")
    public void ProductPage() throws InterruptedException{
        product = new ProductPage(driver);
        
        String bdescription = product.description();
        

        Assert.assertTrue(bdescription.contains("keyboard"));

        product.clickItem();
        Thread.sleep(3000);

        String item = product.itemPrice();
        String itemtitle = product.itemTitle();
        String about = product.about();
      
        // System.out.println(item);
        // System.out.println(itemtitle);
        // System.out.println(about);
        
         Assert.assertTrue(!item.isEmpty());
        Assert.assertTrue(!itemtitle.isEmpty());

        Assert.assertTrue(!about.isEmpty());
        product.addToCart();
        Thread.sleep(5000);


        

        


    }
    @Test(dependsOnMethods = "ProductPage")
    public void CartPage() throws InterruptedException{
        cart = new CartPage(driver);
        
        cart.cartKO();
        Thread.sleep(5000);

        String cartItem = cart.cartItem();
        String cartTitle = cart.cartPrice();
        // System.out.println(cartItem);
        // System.out.println(cartTitle);

          Assert.assertTrue(!cartItem.isEmpty());
        Assert.assertTrue(!cartTitle.isEmpty());

       

    }
        
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
    
}

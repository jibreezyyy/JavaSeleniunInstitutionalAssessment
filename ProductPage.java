package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v114.css.CSS;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ProductPage extends HomePage {
        
             public ProductPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }


            WebDriver driver;
        
             
             @FindBy(className = "a-color-state")
             WebElement description;

             @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")
            WebElement click;
           
            @FindBy(id = "productTitle")
            WebElement prod;

            // @FindBy(xpath = "//span[@class='a-offscreen'][text()='$26.99']")
            // WebElement price;    

            @FindBy(xpath = "/html/body/div[1]/div/div[9]/div[3]/div[4]/div[13]/div[3]/div[1]/span[2]/span[2]/span[2]")
            WebElement price;      

            @FindBy(xpath = "/html/body/div[1]/div/div[9]/div[3]/div[4]/div[30]/div[1]/div/form/div/ul/li[1]/span/div/span/span/span/button/div/div[2]/div/span/p")
            WebElement about;

            @FindBy(id = "add-to-cart-button")
            WebElement cart;



             public String  description(){

                return description.getText();
             }
             public void clickItem(){
                click.click();
             }

             public String itemTitle(){
                return prod.getText();
             }
             public String itemPrice(){
                return price.getText();

             }

             public String about(){
                return about.getText();
             }
             public void addToCart(){
                cart.click();
             }

             
             
             
            
    
}




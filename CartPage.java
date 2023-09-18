package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v114.css.CSS;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CartPage extends HomePage {
        
             public CartPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }


            WebDriver driver;
        
             
            
             @FindBy(className = "a-button-text")
             WebElement Cartko;

              @FindBy(xpath = "/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/ul/li[1]/span/a/span[1]/span/span[2]")
            WebElement cartItem;    


             @FindBy(xpath = "/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/ul/div[1]/div/div/p/span")
            WebElement cartPrice;

             
             public void cartKO(){
                Cartko.click();
             }

             public String cartItem(){
                return cartItem.getText();

             }

             public String cartPrice(){
                return cartPrice.getText();
             }

             
             
             
            
    
}




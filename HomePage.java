package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
        
             WebDriver driver;

             
             @FindBy(id = "twotabsearchtextbox")
             WebElement search;
             
             @FindBy(id = "nav-search-submit-button")
             WebElement button;

        
            public HomePage(WebDriver driver){

                this.driver = driver;
                PageFactory.initElements(driver, this);

             }
             
             public void search(String strSearch){
                search.sendKeys("keyboard");
                
        
                
             }
             
             public void button(){
                button.click();
             }
    
}




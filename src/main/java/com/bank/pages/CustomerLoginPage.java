package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {

    public CustomerLoginPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerDropDown;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement logOutButton;

    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameText;

    public void selectCustomerFromDropDown(String customerName){
        Reporter.log("Select 'CUSTOMER NAME' from DropDown : " + customerName + "<br>");
        selectByVisibleTextFromDropDown(customerDropDown,customerName);
    }

    public void clickOnLoginButton(){
        // CustomListeners.node.log(Status.PASS, "Click on 'ADD CUSTOMER TAB' button");
        Reporter.log("Click on 'LOGIN BUTTON' button" + loginButton.getText() + "<br>");
        clickOnElement(loginButton);
    }
    public boolean getLogOutButtonDisplay(){
        return logOutButton.isDisplayed();
    }

    public void clickOnLogOutButton(){
        // CustomListeners.node.log(Status.PASS, "Click on 'ADD CUSTOMER TAB' button");
        Reporter.log("Click on 'LOGOUT BUTTON' button" + logOutButton.getText() + "<br>");
        clickOnElement(logOutButton);
    }

    public String getVerifyYourNameText(){
        Reporter.log("get the text " + yourNameText.getText() + "<br>");
        return getTextFromElement(yourNameText);
    }


}

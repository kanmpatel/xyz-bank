package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomerPage extends Utility {

    public CustomerPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerDropDown;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement depositTab;



    public void selectCustomerFromDropDown(String customerName){
        Reporter.log("Select 'CUSTOMER NAME' from DropDown : " + customerName + "<br>");
        selectByVisibleTextFromDropDown(customerDropDown,customerName);
    }

    public void clickOnLoginButton(){
        // CustomListeners.node.log(Status.PASS, "Click on 'ADD CUSTOMER TAB' button");
        Reporter.log("Click on 'LOGIN BUTTON' button" + loginButton.getText() + "<br>");
        clickOnElement(loginButton);
    }

    public void clickOnDepositTab(){
        // CustomListeners.node.log(Status.PASS, "Click on 'ADD CUSTOMER TAB' button");
        Reporter.log("Click on 'DEPOSIT TAB button" + depositTab.getText() + "<br>");
        clickOnElement(depositTab);
    }

}

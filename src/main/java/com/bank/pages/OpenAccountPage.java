package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {

    public OpenAccountPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerDropDown;

    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropDown;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processButton;

    public void selectCustomerFromDropDown(String customerName){
        Reporter.log("Select 'CUSTOMER NAME' from DropDown : " + customerName + "<br>");
        selectByVisibleTextFromDropDown(customerDropDown,customerName);
    }

    public void selectCurrencyFromDropDown(String currencyName){
        Reporter.log("Select 'CURRENCY NAME' from DropDown : " + currencyName + "<br>");
        selectByVisibleTextFromDropDown(currencyDropDown,currencyName);
    }

    public void clickOnProcessButton(){
        Reporter.log("Click on 'PROCESS' button" + processButton.getText() + "<br>");
        clickOnElement(processButton);
    }

    public String getVerifyAccountCreatedText(){
        //CustomListeners.node.log(Status.PASS, "Get Customer Added SuccessFully text : " + getTextFromAlert());
        Reporter.log("Get Account created SuccessFully text : " + getTextFromAlert() + "<br>");
        return getTextFromAlert();
    }
    public void clickOnOkButtonToAcceptPopUpMessage(){
        //CustomListeners.node.log(Status.PASS, "Click on 'OK BUTTON TO ACCEPT THE ALERT' button");
        Reporter.log("Click on 'OK BUTTON TO ACCEPT THE ALERT' button" + "<br>");
        acceptAlert();
    }

}

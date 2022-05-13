package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {

    public AccountPage() {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//input[@ng-model=\"amount\"]")
    WebElement amountField;

    @FindBy(xpath = "//div[@class='form-group']/following-sibling::button[@type='submit']")
    WebElement depositButton;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement depositSuccessfulText;





    public void enterDepositAmount(String amount) {
        sendTextToElement(amountField, amount);
        //CustomListeners.node.log(Status.PASS, "Enter lastName : '" + lastName + "' to lastName field");
        Reporter.log("Enter desposut amount : '" + amount + "' to amount field" + "<br>");
    }

    public void clickOnDepositButton(){
        // CustomListeners.node.log(Status.PASS, "Click on 'ADD CUSTOMER TAB' button");
        Reporter.log("Click on 'DEPOSIT' button" + depositButton.getText() + "<br>");
        clickOnElement(depositButton);
    }

    public String getVerifyDepositSuccessText(){
        Reporter.log("get the text" + depositSuccessfulText.getText() + "<br>");
        return getTextFromElement(depositSuccessfulText);
    }


}

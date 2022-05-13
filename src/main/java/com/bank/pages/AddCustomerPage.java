package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {

    public AddCustomerPage() {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstNameField;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement lastNameField;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement postCodeField;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomerButton;


    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        //CustomListeners.node.log(Status.PASS, "Enter Firstname : '" + firstName + "' to firstName field");
        Reporter.log("Enter Firstname : '" + firstName + "' to firstName field" + "<br>");
    }
    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        //CustomListeners.node.log(Status.PASS, "Enter lastName : '" + lastName + "' to lastName field");
        Reporter.log("Enter lastName : '" + lastName + "' to lastName field" + "<br>");
    }
    public void enterPostCode(String postCode) {
        sendTextToElement(postCodeField, postCode);
        //CustomListeners.node.log(Status.PASS, "Enter postCode : '" + postCode + "' to postCode field");
        Reporter.log("Enter postCode : '" + postCode + "' to postCode field" + "<br>");
    }
    public void clickOnAddCustomerButton(){
        //CustomListeners.node.log(Status.PASS, "Click on 'ADD CUSTOMER BUTTON' button");
        Reporter.log("Click on 'ADD CUSTOMER BUTTON' button" + "<br>");
        clickOnElement(addCustomerButton);
    }
    public String getVerifyCustomerAddedInListText(){
      //CustomListeners.node.log(Status.PASS, "Get Customer Added SuccessFully text : " + getTextFromAlert());
        Reporter.log("Get Customer Added SuccessFully text : " + getTextFromAlert() + "<br>");
        return getTextFromAlert();
    }
    public void clickOnOkButtonToAcceptPopUpMessage(){
       //CustomListeners.node.log(Status.PASS, "Click on 'OK BUTTON TO ACCEPT THE ALERT' button");
        Reporter.log("Click on 'OK BUTTON TO ACCEPT THE ALERT' button" + "<br>");
        acceptAlert();
    }




}

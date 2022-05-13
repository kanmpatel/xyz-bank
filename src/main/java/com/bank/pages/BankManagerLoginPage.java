package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

    public BankManagerLoginPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccountTab;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomerTab;


    public void clickOnAddCustomerTab(){
       // CustomListeners.node.log(Status.PASS, "Click on 'ADD CUSTOMER TAB' button");
        Reporter.log("Click on 'ADD CUSTOMER TAB' button" + addCustomerTab.getText() + "<br>");
        clickOnElement(addCustomerTab);
    }


    public void clickOnOpenAccountTab(){
        // CustomListeners.node.log(Status.PASS, "Click on 'ADD CUSTOMER TAB' button");
        Reporter.log("Click on 'OPEN ACCOUNT TAB' button" + openAccountTab.getText() + "<br>");
        clickOnElement(openAccountTab);
    }


}

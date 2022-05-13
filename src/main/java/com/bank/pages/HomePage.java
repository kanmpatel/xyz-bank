package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginTab;

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginTab;




    public void clickOnBankManagerLoginTab() {
        //CustomListeners.node.log(Status.PASS,"Click on 'Add BANK MANAGER TAB' button");
        Reporter.log("Click on 'BANK MANAGER LOGIN TAB' button" + bankManagerLoginTab.getText() + "<br>");
        clickOnElement(bankManagerLoginTab);

    }

    public void clickOnCustomerLoginTab(){
        // CustomListeners.node.log(Status.PASS, "Click on 'ADD CUSTOMER TAB' button");
        Reporter.log("Click on 'CUSTOMER LOGIN TAB' button" + customerLoginTab.getText() + "<br>");
        clickOnElement(customerLoginTab);
    }

}

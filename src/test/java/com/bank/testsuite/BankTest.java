package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Jay Vaghani
 */

public class BankTest extends TestBase {

    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomerLoginPage customerLoginPage;
    CustomerPage customerPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        openAccountPage = new OpenAccountPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
        customerPage = new CustomerPage();
        accountPage = new AccountPage();
    }

    @Test(groups = {"sanity","regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("john");
        addCustomerPage.enterLastName("patel");
        addCustomerPage.enterPostCode("456789");
        addCustomerPage.clickOnAddCustomerButton();
        String expectedMessage = "Customer added successfully";
        String actualMessage = addCustomerPage.getVerifyCustomerAddedInListText();
        Assert.assertEquals(actualMessage.substring(0,27),expectedMessage,"text is not match");
    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnOpenAccountTab();
        openAccountPage.selectCustomerFromDropDown("Hermoine Granger");
        openAccountPage.selectCurrencyFromDropDown("Pound");
        openAccountPage.clickOnProcessButton();
        String expectedMessage = "Account created successfully";
        String actualMessage = openAccountPage.getVerifyAccountCreatedText();
        Assert.assertEquals(actualMessage.substring(0,28),expectedMessage,"text is not match");
    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
        SoftAssert softAssert =  new SoftAssert();
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectCustomerFromDropDown("Ron Weasly");
        customerLoginPage.clickOnLoginButton();
        softAssert.assertTrue(customerLoginPage.getLogOutButtonDisplay());
        customerLoginPage.clickOnLogOutButton();
        String expectedMessage = "Your Name";
        String actualMessage = customerLoginPage.getVerifyYourNameText();
        softAssert.assertEquals(actualMessage.substring(0,9),expectedMessage,"text is not match");
        softAssert.assertAll();
    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerPage.selectCustomerFromDropDown("Hermoine Granger");
        customerPage.clickOnLoginButton();
        customerPage.clickOnDepositTab();
        accountPage.enterDepositAmount("5000");
        accountPage.clickOnDepositButton();
        String expectedMessage = "Deposit Successful";
        String actualMessage = accountPage.getVerifyDepositSuccessText();
        Assert.assertEquals(actualMessage,expectedMessage,"text is not match");
    }

    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() {

    }


}

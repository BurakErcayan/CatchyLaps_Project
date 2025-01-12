package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
    LoginPage loginPage;

    public LoginSteps() {
        loginPage = new LoginPage(DriverFactory.getDriver());
    }

    @Given("Login, Check Text, Enter User Name Textbox: {string}")
    public void loginCheckEnterUserName(String text) {
        loginPage.checkEnterUserNameText(text);
    }

    @When("Login, SendKeys, User Name Textbox: {string}")
    public void loginSendKeysUserNameTextboxString(String text) {
        loginPage.sendKeysUserName(text);
    }

    @When("Login, SendKeys, Password Textbox: {string}")
    public void loginSendKeysPasswordTextbox(String text) {
        loginPage.sendKeysPassword(text);
    }

    @Given("Login, Click, Log In Button")
    public void clickLoginButtonOnLoginPage() {
        loginPage.clickLoginButton();
    }

    @When("Transfer, Check Text, Open Money Transfer Textbox: {string}")
    public void transferCheckTextOpenMoneyTransferTextbox(String text) {
        loginPage.checkOpenMoneyTransferTextbox(text);
    }

    @When("Transfer, Click, Open Money Transfer Button")
    public void transferClickOpenMoneyTransferButton() {
        loginPage.clickOpenMoneyButton();
    }

    @Then("Login, Check Text, Alert Text: {string}")
    public void loginCheckTextAlertText(String text) {
        loginPage.checkAlertText(text);
    }
}

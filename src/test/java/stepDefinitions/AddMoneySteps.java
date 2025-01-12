package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddMoneyPage;
import utils.DriverFactory;

public class AddMoneySteps {

    AddMoneyPage addMoneyPage;

    public AddMoneySteps() {
        addMoneyPage = new AddMoneyPage(DriverFactory.getDriver());
    }

    @Then("Add Money, Check Text, Popup Title: {string}")
    public void addMoneyCheckTextPopupTitle(String text) {
        addMoneyPage.checkTitle(text);
    }

    @When("Add Money, SendKeys, Card Number Textbox: {string}")
    public void addMoneySendKeysCardNumberTextbox(String text) {
        addMoneyPage.sendKeysCardNumber(text);
    }

    @When("Add Money, SendKeys, Card Holder Textbox: {string}")
    public void addMoneySendKeysCardHolderTextbox(String text) {
        addMoneyPage.sendKeysCardHolder(text);
    }

    @When("Add Money, SendKeys, Expriy Date Textbox: {string}")
    public void addMoneySendKeysExpriyDateTextbox(String text) {
        addMoneyPage.sendKeysExpirtyDate(text);
    }

    @When("Add Money, SendKeys, Cvv Textbox: {string}")
    public void addMoneySendKeysCvvTextbox(String text) {
        addMoneyPage.sendKeysCvvTextbox(text);
    }

    @When("Add Money, SendKeys, Amount Textbox: {string}")
    public void addMoneySendKeysAmountTextbox(String text) {
        addMoneyPage.sendKeysAmountTextbox(text);
    }

    @When("Add Money, Click, Add Button")
    public void addMoneyClickAmountButton() {
        addMoneyPage.clickAddButton();
    }

    @Then("Add Money, Check Text, Amount Required: {string}")
    public void addMoneyCheckTextAmountRequired(String text) {
        addMoneyPage.checkAmountRequired(text);
    }
}

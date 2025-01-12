package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditAccountPage;
import utils.DriverFactory;

public class EditAccountSteps {

    EditAccountPage editAccountPage;

    public EditAccountSteps() {
        editAccountPage = new EditAccountPage(DriverFactory.getDriver());
    }

    @Then("Edit Account, Check Text, Page Title: {string}")
    public void editAccountCheckTextPageTitle(String text) {
        editAccountPage.checkEditAccount(text);
    }

    @When("Edit Account, Clear, Account Name")
    public void editAccountClearAccountName() {
        editAccountPage.clearEditAccountName();
    }

    @When("Edit Account, SendKeys, Random Account Name Textbox")
    public void editAccountSendKeysAccountNameTextbox() {
        editAccountPage.sendKeysRandomAccountName();
    }

    @When("Edit Account, Click, Update Button")
    public void editAccountClickUpdateButton() {
        editAccountPage.clickEditUpdateButton();
    }
}

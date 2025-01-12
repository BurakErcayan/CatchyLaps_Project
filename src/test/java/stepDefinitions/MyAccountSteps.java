package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MyAccountPage;
import utils.DriverFactory;


public class MyAccountSteps {
    MyAccountPage myAccountPage;

    public MyAccountSteps(){
        myAccountPage= new MyAccountPage(DriverFactory.getDriver());
    }

    @Then("My Account, Save Text, Price")
    public void myAccountSaveTextPrice() {
        myAccountPage.savePrice();
    }

    @Then("My Account, Check Saved , Price")
    public void myAccountCheckSavedText() {
        myAccountPage.checkSavePrice();
    }

    @Then("My Account, Check Text, Page Title: {string}")
    public void myAccountCheckTextPageTitle(String text) {
        myAccountPage.checkMyAccoutTitle(text);
    }

    @When("My Account, Click, Add Money Button")
    public void myAccountClickAddMoneyButton() {
        myAccountPage.clickAddMoneyButton();
    }

    @Then("My Account, Check Text, Random Account Name")
    public void myAccountCheckTextAccountName() {
        myAccountPage.checkRandomAccountName();
    }

    @When("My Account, Click, Edit Account Button")
    public void editAccountClickEditAccountButton() {
        myAccountPage.clickEditAccountButton();
    }

}

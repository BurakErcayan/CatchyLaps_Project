package pages;

import models.MyAccountModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;
import utils.Hooks;
import utils.ScenarioContext;

public class MyAccountPage {

    ElementHelper elementHelper;
    ScenarioContext scenarioContext;

    public MyAccountPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
        scenarioContext = Hooks.getScenarioContext();
    }

    public void savePrice() {
        scenarioContext.set("savedPrice", elementHelper.getText(MyAccountModel.PRICE));
    }

    public void checkSavePrice() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(scenarioContext.get("savedPrice"), elementHelper.getText(MyAccountModel.PRICE));
    }

    public void checkRandomAccountName() {
        elementHelper.waitText(MyAccountModel.ACCOUNT_NAME,scenarioContext.get("randomAccount"));
    }

    public void clickAddMoneyButton() {
        elementHelper.click(MyAccountModel.ADD_MONEY_BUTTON);
    }

    public void checkMyAccoutTitle(String expText) {
        String actText = elementHelper.getText(MyAccountModel.MY_ACCOUNT_TITLE);
        Assert.assertEquals(actText.toLowerCase(), expText.toLowerCase());
    }

    public void clickEditAccountButton(){
        elementHelper.click(MyAccountModel.EDIT_ACCOUNT_BUTTON);
    }

}

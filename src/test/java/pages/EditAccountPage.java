package pages;

import models.EditAccountModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;
import utils.Hooks;
import utils.ScenarioContext;

import java.util.Random;

public class EditAccountPage {
    ElementHelper elementHelper;
    ScenarioContext context;

    public EditAccountPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
        context = Hooks.getScenarioContext();
    }

    public void checkEditAccount(String expText) {
        String actText = elementHelper.getText(EditAccountModel.EDIT_ACCOUNT_TITLE);
        Assert.assertEquals(actText, expText);
    }

    public void clearEditAccountName() {
        elementHelper.clear(EditAccountModel.EDIT_ACCOUNT_NAME);
    }

    public void sendKeysRandomAccountName() {
        String randomAccount = generateRandomAccount();
        context.set("randomAccount", randomAccount);
        elementHelper.sendKeys(EditAccountModel.EDIT_ACCOUNT_NAME, randomAccount);
    }

    public void clickEditUpdateButton() {
        elementHelper.click(EditAccountModel.EDIT_UPDATE_BUTTON);
    }

    public String generateRandomAccount() {
        int length = 8; // String uzunluğu
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder randomString = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }
        return randomString.toString();
    }
}
package pages;

import models.LoginModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;

public class LoginPage {

    ElementHelper elementHelper;

    public LoginPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    public void checkEnterUserNameText(String expText) {
        String actText = elementHelper.getText(LoginModel.ENTER_USERNAME);
        Assert.assertEquals(actText, expText);
    }

    public void checkAlertText(String expText) {
        String actText = elementHelper.getText(LoginModel.ALERT_TEXT);
        Assert.assertEquals(actText, expText);
    }

    public void sendKeysUserName(String text) {
        elementHelper.sendKeys(LoginModel.USERNAME_TEXTBOX, text);
    }

    public void sendKeysPassword(String text) {
        elementHelper.sendKeys(LoginModel.PASSWORD_TEXTBOX, text);
    }

    public void clickLoginButton() {
        elementHelper.click(LoginModel.LOGIN_BUTTON);
    }

    public void clickOpenMoneyButton() {
        elementHelper.click(LoginModel.OPEN_MONEY_TRANSFER_BUTTON);
    }

    public void checkOpenMoneyTransferTextbox(String expText) {
        String actText = elementHelper.getText(LoginModel.OPEN_MONEY_TRANSFER_BUTTON);
        Assert.assertEquals(actText.toLowerCase(), expText.toLowerCase());
    }

}

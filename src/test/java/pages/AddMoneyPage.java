package pages;

import models.AddMoneyModel;
import models.EditAccountModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;

public class AddMoneyPage {

    ElementHelper elementHelper;

    public AddMoneyPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }


    public void checkTitle(String expText) {
        String actText = elementHelper.getText(AddMoneyModel.ADD_MONEY_PAGE_TITLE);
        Assert.assertEquals(actText, expText);
    }

    public void sendKeysCardNumber(String text) {
        elementHelper.sendKeys(AddMoneyModel.ADD_MONEY_CARD_NUMBER_TEXTBOX, text);
    }

    public void sendKeysCardHolder(String text) {
        elementHelper.sendKeys(AddMoneyModel.ADD_MONEY_CARD_HOLDER_TEXBOX, text);
    }

    public void sendKeysExpirtyDate(String text) {
        elementHelper.sendKeys(AddMoneyModel.ADD_MONEY_EXPIRY_DATE_TEXTBOX,text);
    }

    public void sendKeysCvvTextbox(String text) {
        elementHelper.sendKeys(AddMoneyModel.ADD_MONEY_CVV_TEXTBOX, text);
    }

    public void sendKeysAmountTextbox(String text) {
        elementHelper.sendKeys(AddMoneyModel.ADD_MONEY_AMOUNT_TEXTBOX, text);
    }

    public void clickAddButton() {
        elementHelper.click(AddMoneyModel.ADD_MONEY_ADD_BUTTON);
    }

    public void checkAmountRequired(String text){
        elementHelper.waitText(AddMoneyModel.AMOUNT_REQUIRED,text);
    }

}

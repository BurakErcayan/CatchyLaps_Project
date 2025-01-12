package models;

import org.openqa.selenium.By;

public class MyAccountModel {
    public static final By PRICE = By.cssSelector(".css-175oi2r.r-14lw9ot.r-z2wwpe.r-edyy15>.css-175oi2r>.css-175oi2r>.css-146c3p1.r-1ozpqpt.r-yv33h5.r-1b43r93");
    public static final By ACCOUNT_NAME = By.cssSelector("div[class='css-175oi2r r-14lw9ot r-z2wwpe r-edyy15'] div:nth-child(1) div:nth-child(2)");
    public static final By TRANSFER_MONEY_BUTTON = By.cssSelector(".r-1awozwy.r-1fvujvx>div:nth-child(1)>.css-146c3p1.r-jwli3a.r-1b43r93");
    public static final By ADD_MONEY_BUTTON = By.cssSelector(".r-1awozwy.r-1fvujvx>div:nth-child(2)>.css-146c3p1.r-jwli3a.r-1b43r93");
    public static final By EDIT_ACCOUNT_BUTTON = By.cssSelector(".r-1awozwy.r-1fvujvx>div:nth-child(3)>.css-146c3p1.r-jwli3a.r-1b43r93");
    public static final By MY_ACCOUNT_TITLE = By.cssSelector(".css-146c3p1.r-1gknse6.r-1b43r93:nth-child(1)");
}

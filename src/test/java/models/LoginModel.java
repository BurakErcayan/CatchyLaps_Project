package models;

import org.openqa.selenium.By;

public class LoginModel {
    public static final By USERNAME_TEXTBOX = By.cssSelector("input[placeholder='Username']");
    public static final By PASSWORD_TEXTBOX = By.cssSelector("input[placeholder='Password']");
    public static final By LOGIN_BUTTON = By.cssSelector(".css-175oi2r.r-1ifxtd0.r-13qz1uu>.css-175oi2r.r-1i6wzkk");
    public static final By ENTER_USERNAME = By.cssSelector(".r-1rttkqs>.r-13qz1uu:nth-child(2) .r-15zivkp");
    public static final By OPEN_MONEY_TRANSFER_BUTTON = By.cssSelector(".css-175oi2r.r-1awozwy>.css-175oi2r.r-1i6wzkk");
    public static final By ALERT_TEXT = By.cssSelector(".css-146c3p1.r-howw7u.r-1b43r93");
}

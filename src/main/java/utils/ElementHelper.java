package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ElementHelper {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor javascriptExecutor;
    Actions actions;
    PropertiesReader propertiesReader;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
        this.propertiesReader = new PropertiesReader();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(propertiesReader.getProperty("webDriverWait"))));
        this.javascriptExecutor = (JavascriptExecutor) driver;
        this.actions = new Actions(driver);
        boolean isSafari;
    }

    public WebElement findElement(By by) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        scroll(element);
        moveToElement(element);
        return element;
    }

    public void waitInvisible(By by) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public void scroll(WebElement element) {
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({\n" + "            behavior: 'instant',\n" + "            block: 'center',\n" + "            inline: 'center'\n" + "        });", element);
    }

    public void moveToElement(WebElement element) {
        actions.moveToElement(element).build().perform();
    }

    public void click(By by) {
        findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public String getText(By by) {
        return findElement(by).getText();
    }

    public void waitText(By by,String text) {
         wait.until(ExpectedConditions.textToBePresentInElement(findElement(by),text));
    }

    public String getAttribute(By by, String attr) {
        return findElement(by).getDomProperty(attr);
    }

    public void check(By by) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        scroll(element);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void clear(By by) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        scroll(element);
        for (int i = 0; i < 25; i++) {
            element.sendKeys(Keys.BACK_SPACE);
        }
    }


}

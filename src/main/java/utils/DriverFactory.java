package utils;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.Assert;

import java.time.Duration;

public class DriverFactory {

    private static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    public static void setDriver() {
        PropertiesReader propertiesReader = new PropertiesReader();
        String browser = propertiesReader.getProperty("browser");
        boolean isMobile = Boolean.parseBoolean(propertiesReader.getProperty("mobile"));
        switch (browser) {
            case "Chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(Long.parseLong(propertiesReader.getProperty("implicityWait"))));
                chromeOptions.setPageLoadTimeout(Duration.ofSeconds(Long.parseLong(propertiesReader.getProperty("pageLoadTimeout"))));
                webDriverThreadLocal.set(new ChromeDriver(chromeOptions));
                break;
            case "Firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                firefoxOptions.setImplicitWaitTimeout(Duration.ofSeconds(Long.parseLong(propertiesReader.getProperty("implicityWait"))));
                firefoxOptions.setPageLoadTimeout(Duration.ofSeconds(Long.parseLong(propertiesReader.getProperty("pageLoadTimeout"))));
                webDriverThreadLocal.set(new FirefoxDriver(firefoxOptions));
                break;
            case "Safari":
                SafariOptions safariOptions = new SafariOptions();
                safariOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                safariOptions.setImplicitWaitTimeout(Duration.ofSeconds(Long.parseLong(propertiesReader.getProperty("implicityWait"))));
                safariOptions.setPageLoadTimeout(Duration.ofSeconds(Long.parseLong(propertiesReader.getProperty("pageLoadTimeout"))));
                webDriverThreadLocal.set(new SafariDriver(safariOptions));
                break;
            default:
                Assert.assertTrue(false, "Lütfen doğru bir browser seçin!! : " + browser);
        }
        if (isMobile) {
            webDriverThreadLocal.get().manage().window().setSize(new Dimension(430, 932));
        } else {
            webDriverThreadLocal.get().manage().window().maximize();
        }

        webDriverThreadLocal.get().get(propertiesReader.getProperty("url"));
    }

    public static WebDriver getDriver() {
        return webDriverThreadLocal.get();
    }

    public static void quitDriver() {
        if (webDriverThreadLocal.get() != null) {
            webDriverThreadLocal.get().quit();
            webDriverThreadLocal.remove();
        }
    }


}

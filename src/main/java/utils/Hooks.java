package utils;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    private static ScenarioContext context;

    @Before
    public void before() {
        DriverFactory.setDriver();
        context = new ScenarioContext();
    }

    @After
    public void after() {
        DriverFactory.quitDriver();
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }

    public static ScenarioContext getScenarioContext() {
        return context;
    }
}

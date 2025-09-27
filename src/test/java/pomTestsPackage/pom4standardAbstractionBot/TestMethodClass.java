package pomTestsPackage.pom4standardAbstractionBot;

import engine.WebDriverBot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestMethodClass {
    WebDriverBot bot;

    @BeforeMethod
    public void beforeMethod() {
        bot = new WebDriverBot();
    }

    @AfterMethod
    public void afterMethod() {
        bot.quit();
    }
}

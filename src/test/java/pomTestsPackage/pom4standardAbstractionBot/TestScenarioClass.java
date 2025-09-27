package pomTestsPackage.pom4standardAbstractionBot;

import engine.WebDriverBot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class TestScenarioClass {
    WebDriverBot bot;
    
    @BeforeClass
    public void beforeClass() {
        bot = new WebDriverBot();
    }

    @AfterClass
    public void afterClass() {
        bot.quit();
    }
}

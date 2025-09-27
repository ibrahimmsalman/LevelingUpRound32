package pomTestsPackage.pom4standardAbstractionBot;

import duckDuckGo.search.pom4standardAbstractionBot.Home;
import duckDuckGo.search.pom4standardAbstractionBot.Results;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstModularTest extends TestMethodClass {
    private Home home;
    private Results results;

    /**
     * Navigate to duckduck go, search for selenium webdriver, and assert that the first search result url is correct
     */
    @Test
    public void searchSeleniumWebDriverAndCheckFirstResultUrl() {
        var searchQuery = "selenium webdriver";
        home = new Home(bot);
        results = new Results(bot);
        home.open();
        home.search(searchQuery);
        String expectedUrl = "https://www.selenium.dev/documentation/webdriver/";
        String actualUrl = results.getSearchResultUrl(1);
        Assert.assertEquals(actualUrl, expectedUrl, "First search result URL does not match expected URL");
    }

    /**
     * Navigate to duckduck go, search for cucumberio, and assert that the second search result url is correct
     */
    @Test
    public void searchCucumberIoAndCheckSecondResultUrl() {
        var searchQuery = "cucumberio";
        results.open(searchQuery);
        String expectedUrl = "https://cucumber.io/";
        String actualUrl = results.getSearchResultUrl(2);
        Assert.assertEquals(actualUrl, expectedUrl, "Second search result URL does not match expected URL");
    }

}

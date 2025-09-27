package duckDuckGo.search.pom4standardAbstractionBot;

import engine.WebDriverBot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Home {
//    private final WebDriver driver;
    private final WebDriverBot bot;
    private static final String url = "https://duckduckgo.com/";
    private static final By searchInput = By.cssSelector("#searchbox_input");

    public Home(WebDriverBot bot) {
//        this.driver = driver;
//        bot = new WebDriverBot(driver);
        this.bot = bot;
    }

    public void open() {
//        driver.navigate().to(url);
        bot.navigateTo(url);
    }

    public void search(String searchText) {
//        driver.findElement(searchInput).sendKeys(searchText, Keys.ENTER);
        bot.type(searchText +  Keys.ENTER, searchInput);
        bot.click(searchInput);
    }
}

package junitTestsPackage;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJunitTests {
    WebDriver driver;
    // mvn -Dtest=SeleniumJunitTests test
    // mvn -Dtest=SeleniumJunitTests,RestAssuredTests test

    @Test
    public void test1(){
        driver.navigate().to("https://duckduckgo.com/");
//        Assertions.assertTrue(driver.getCurrentUrl().contains("duckduckgo"));
        Assertions.assertThat(driver.getCurrentUrl()).containsIgnoringCase("Duck").doesNotContainIgnoringCase("Google");
    }

    @Test
    public void test2(){
        driver.navigate().to("https://duckduckgo.com/");
        Assertions.assertThat(driver.getCurrentUrl()).containsIgnoringCase("Duck").doesNotContainIgnoringCase("Google");
    }

    @Test
    public void test3(){
        driver.navigate().to("https://duckduckgo.com/");
        Assertions.assertThat(driver.getCurrentUrl()).containsIgnoringCase("Duck").doesNotContainIgnoringCase("Google");
    }

    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void teardown(){
        driver.quit();
    }
}

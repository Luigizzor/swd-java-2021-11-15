package simple;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SimpleFixtureTest {
    WebDriver driver;
    @BeforeAll
    static void initDriverManager()
    {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        WebDriverManager.chromedriver().setup();

    }
    @BeforeEach
    void initDriver(){
        var options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", List.of("enable-automation"));
        driver= new ChromeDriver(options);
    }
    @AfterEach
    void closeDriver(){
        driver.quit();
    }
    @Test
    void testHeader(){
        log.info("Test header");
        driver.get("https://luigizzor.github.io/swd-java-2021-11-15/");

        WebElement header = driver.findElement(By.tagName("h1"));
        //System.out.println(header.getText());
        String text=header.getText();
        log.debug("Text is: " + text);
        assertEquals ("Welcome in Selenium", text);
    }
    @Test
    void testHeaderWithErasure() {
        // Java 9 type erasure
        driver.get("https://training360.github.io/swd-java-2021-11-15/");

        var header = driver.findElement(By.tagName("h1"));
        var text = header.getText();
        assertEquals("Welcome in Selenium Training!", text);
    }

    @Test
    void testTitle()
    {

        driver.get("https://luigizzor.github.io/swd-java-2021-11-15/");
        assertEquals("Welcome in Selenium", driver.findElement(By.tagName("h1")).getText());
    }
}

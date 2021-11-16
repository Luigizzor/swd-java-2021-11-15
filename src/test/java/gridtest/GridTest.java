package gridtest;

import extension.SeleniumTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.net.URL;

@SeleniumTest
public class GridTest {
    @Test
    void gridTest(WebDriver driver, URL url){
        driver.get(url +"/grid");

    }

}

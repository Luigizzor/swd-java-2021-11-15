package gridtest;

import extension.SeleniumTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;

@SeleniumTest
public class GridTest {
    @Test
    void secondRowTest(WebDriver driver, URL url){
        driver.get(url + "/grid");
    var cells=driver.findElement(By.cssSelector("tr:nth-child(2)">td));

    }

}

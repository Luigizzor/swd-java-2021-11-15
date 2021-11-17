package components;

import extension.SeleniumTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SeleniumTest
public class compTest {
    @Test
    void componentSelectTest(WebDriver driver, URL url){
        driver.get(url + "/components/");
        driver.findElement(By.name("checkbox")).click();
        assertTrue(driver.findElement(By.name("disabled-checkbox")).isDisplayed());
    }
    @Test
    void dropdowntTest(WebDriver driver, URL url){
        driver.get(url + "/components/");

        var select = new Select(driver.findElement(By.id("dropdown")));
        select.getOptions().forEach(e->e.getText());
        select.selectByIndex(2);

        assertEquals("Option 3",select.getFirstSelectedOption().getText());
    }
    @Test
    void multiSelect(WebDriver driver, URL url)
    {
        driver.get(url + "/components/");
        var multiselect =new Select (driver.findElement(By.id("multi-select")));
        multiselect.selectByIndex(0);
        multiselect.selectByIndex(2);


    }
}

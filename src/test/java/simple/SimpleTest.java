package simple;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
//Teszt osztály
class SimpleTest {

    //teszt metódus = test case
    @Test
    @DisplayName("Addition check")
    void testAdd()
    {
        //Given
        int a=5;
        int b=6;
        //When
        int c=a+b;

        //Then
        assertEquals(11,c);
    }
    @Test
    void testHeader()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://luigizzor.github.io/swd-java-2021-11-15/");
        webDriver.quit();
    }

}

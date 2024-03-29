package FinalWork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AbstractTest {
    public static WebDriver driver;
    public String baseUrl = "https://test-stand.gb.ru/";
    public String lastName = "Tanya";
    public String firstName = "Ivanova";
    public String telephone = "89643253232";
    public String password = "75fcc98aed";
    public String username = "GB202308";
    protected static String getBaseUrl;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @BeforeEach
    void goTo() {
        Assertions.assertDoesNotThrow(() -> driver.navigate().to("https://test-stand.gb.ru/login"),
                "Страница не доступна");

    }

    @AfterAll
    static void close() {
        //driver.quit();
    }

   // public static WebDriver getDriver() {
    //    return driver;
    }






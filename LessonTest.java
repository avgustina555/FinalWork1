package FinalWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LessonTest extends AbstractTest {

    @Test
    void myActiontest() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/div")).click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("test-stand.gb.ru/login"));
        Assertions.assertTrue(getDriver().getTitle().contains("https://test-stand.gb.ru/login"), "страница недоступна");


       Actions search = new Actions(getDriver());

                 search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/div")), "username")

                .sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")), "password")

                .click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[3]/button/div")))

                .build()
                .perform();
    }

    public static WebDriver getDriver() {
        return driver;
    }
    }





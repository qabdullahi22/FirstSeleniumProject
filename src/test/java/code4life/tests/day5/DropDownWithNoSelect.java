package code4life.tests.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDownWithNoSelect {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://demoqa.com/select-menu");
        WebElement selectOne = driver.findElement(By.xpath("(//div[@id='selectOne']//child::div)[7]"));
        wait.until(ExpectedConditions.elementToBeClickable(selectOne)).click();
        WebElement prounon = driver.findElement(By.xpath("//div[text()='Mr.']"));
        wait.until(ExpectedConditions.elementToBeClickable(prounon)).click();

        Thread.sleep(3000);
        driver.quit();
    }
}

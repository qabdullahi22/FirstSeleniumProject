package code4life.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class className {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement usernameListLabel = driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']"));
        String actual = "Accepted usernames are:";

        if(usernameListLabel.getText().equals(actual)){
            System.out.println("Passed !!!!");
        }else {
            System.out.println("Failed !!!!");
        }

        WebElement usernameField = driver.findElement(By.id("user-name"));
        // yak user dadim
        usernameField.sendKeys("User_2020120");
        // aval user ra pak mikonim
        usernameField.clear();
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.name("login-button"));
        loginBtn.click();

        List<WebElement> classSize = driver.findElements(By.className("inventory_item"));
        System.out.println("Size of the class: " + classSize.size());


        Thread.sleep(3000);
        driver.quit();


    }
}

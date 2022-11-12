package code4life.tests.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");

        WebElement color = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(color);
        //select.selectByVisibleText("Purple");
         //select.selectByIndex(3);
         select.selectByValue("3");
         boolean test = select.isMultiple();
        System.out.println("test = " + test);

        List<WebElement> allColors = select.getOptions();

        for (WebElement eachColors: allColors) {
            System.out.println("eachColors = " + eachColors.getText());
        }
        Thread.sleep(3000);
        driver.quit();



    }
}

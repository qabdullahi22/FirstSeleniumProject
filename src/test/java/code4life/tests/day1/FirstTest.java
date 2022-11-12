package code4life.tests.day1;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "C:\\choromdriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://amazon.de");
        driver.navigate().refresh();
        String titel = driver.getTitle();
        String actuall = "Google";
//        if(titel.equalsIgnoreCase(actuall)){
//            System.out.println("Test passed");
//        }else {
//            System.out.println("Test Failed");
//        }
        Thread.sleep(3000);
        driver.quit();




//        System.setProperty("webdiver.chrom.driver",   "C:\\chromedriver.exe" );
//        WebDriver driver = new ChromeDriver();
//
//       driver.get("https://google.com");
//
//       String title = driver.getTitle();
//       String actual = "Google";
//       if(title.equalsIgnoreCase(actual)){
//           System.out.println("Test Passed");
//       }else {
//           System.out.println("Test Failed");
//       }
//       Thread.sleep(3000);

    }
}

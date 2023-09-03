package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        Thread.sleep(10000);
        driver.get("https://www.techlistic.com/p/selenium-practice-from.html");

        driver.manage().deleteAllCookies();//kodun calismasini engellemeden calistirmaya devam eder

    }
}

package day03_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_WebElementMethodlari {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new  ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkElementleriList = driver.findElements(By.tagName("a"));
        int expectedLinksayisi = 147;
        int actualLinkSayisi=linkElementleriList.size();

        if (expectedLinksayisi == actualLinkSayisi){
            System.out.println("Link sayisi testi PASSED");
        }else {
            System.out.println("Link sayisi testi FAILED");
        }
        //4- products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).click();
        //5- special offer yazisinin gorunumune test edin
        WebElement specialOfferElementi= driver.findElement(By.id("sale_image"));
        if (specialOfferElementi.isDisplayed()){
            System.out.println("Special offer testi PASSED");
        }else {
            System.out.println("Special offer testi FAILED");
        }
        //6- Sayfayi kapatin
        driver.close();
    }
}

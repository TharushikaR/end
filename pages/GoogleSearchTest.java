import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearchTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Java");

        Thread.sleep(10000);

        List<WebElement> list= (List<WebElement>) driver.findElement(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));

        System.out.println(list.size());

    }
}

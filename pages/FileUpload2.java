import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.sikuli.script.*;

import java.time.Duration;

public class FileUpload2 {
    public static void main(String[] args) throws InterruptedException, FindFailed {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"imagesrc\"]"))).
                sendKeys("C://Intervest//My Work//Selenium//Notes//11-29//Photos//");

    }
}

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class JavascriptExecutorDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        //flashing
        WebElement joinfree=driver.findElement(By.xpath("//*[@id=\"gw-sign-in-button\"]/span/a"));
        JavaScriptUtil_1.flash(joinfree,driver);

    }
}

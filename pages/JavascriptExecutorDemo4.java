import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class JavascriptExecutorDemo4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        //Click in some element
        WebElement newLogin=driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a"));
        JavaScriptUtil_1.clickElementByJS(newLogin,driver);
    }
}

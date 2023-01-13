import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class JavascriptExecutorDemo6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement newLogin=driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a"));
        JavaScriptUtil_1.clickElementByJS(newLogin,driver);
        //Refreshing page
        //driver.navigate().refresh(); //without JS
        JavaScriptUtil_1.refreshBrowserByJS(driver); //with JS
    }
}

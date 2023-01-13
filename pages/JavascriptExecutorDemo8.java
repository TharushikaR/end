import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class JavascriptExecutorDemo8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        //Scroll down the page till bottom of the page
        JavaScriptUtil_1.scrollPageDown(driver);
    }
}

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class JavascriptExecutorDemo3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        //capture the title of the page
        System.out.println(driver.getTitle()); //without JS
        String title=JavaScriptUtil_1.getTitleByJS(driver); //with JS
        System.out.println(title);
    }
}

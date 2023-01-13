import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.Set;

public class CookiesTest_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Set<Cookie> cookies=driver.manage().getCookies(); //capture all the cookies in this browser
        System.out.println("Size of the cookies "+cookies.size()); //return the count cookies
        System.out.println(driver.manage().getCookieNamed("session-id-time")); //print specific cookie according to the name
    }
}

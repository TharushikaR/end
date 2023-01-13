import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/selenium/newtours/index.php");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());

        driver.navigate().refresh();

        driver.quit();
    }
}

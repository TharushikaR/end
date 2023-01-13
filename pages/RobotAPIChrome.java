import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotAPIChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://spreadsheetpage.com/calendar/yearly/");
        driver.findElement(By.xpath("/html/body/main/section/section/article/section[2]/div[1]/div[3]/div[2]/div/p/a[1]")).click();
        driver.quit();
    }
}

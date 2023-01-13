import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        String text=driver.findElement(By.cssSelector("p")).getText();
        System.out.println(text);
    }
}

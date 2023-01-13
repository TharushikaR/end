import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class JavascriptExecutorDemo7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        WebElement image=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[111]/td[1]/img"));
        //Scroll down the page till find the element
        JavaScriptUtil_1.scrollIntoView(image,driver);
    }
}

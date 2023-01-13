import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Scrolling_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");

        JavascriptExecutor js= (JavascriptExecutor) driver;

        //Scrolling by using pixel
        js.executeScript("window.scrollBy(0,1000)","");

        //Scrolling page till we find element
        WebElement flag=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[2]/tbody/tr[72]/td[1]/img"));
        js.executeScript("arguments[0].scrollIntoView();",flag);

        //Scroll page till bottom
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
}

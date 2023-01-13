import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
        driver.switchTo().frame(0);
        WebElement resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]"));
        Actions act=new Actions(driver);
        act.moveToElement(resize).dragAndDropBy(resize,100,150).build().perform();
        Thread.sleep(3000);
    }
}

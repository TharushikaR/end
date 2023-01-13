import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBetweenAlerts3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
        driver.switchTo().alert().sendKeys("Testing");
        driver.switchTo().alert().accept();
        String actualText=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
        String expectText="Hello Automation Testing user How are you today";

        if (expectText.equals(actualText)){
            System.out.println("Text is equal");
        }else {
            System.out.println("Text is not equal");
        }
    }
}

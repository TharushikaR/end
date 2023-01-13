import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBetweenAlerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        //Alert with OK button Examples

        //Alert with OK Link
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
        //Alert with OK button
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
        //Switch to alert box
        System.out.println(driver.switchTo().alert().getText()); //display the text
        driver.switchTo().alert().accept(); //close the window without clicking ok button-OK button clicked & closed the alert

    }
}

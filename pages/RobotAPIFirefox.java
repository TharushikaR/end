import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotAPIFirefox {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C://Intervest//My Work//Selenium//geckodriver-v0.32.0-win32//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://spreadsheetpage.com/calendar/yearly/");
        driver.findElement(By.xpath("/html/body/main/section/section/article/section[2]/div[1]/div[3]/div[2]/div/p/a[1]")).click();

        Robot robot=new Robot();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN); //Press down arrow in keyboard
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_TAB); //Press Tab in keyboard
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_TAB); //Press Tab in keyboard
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_TAB); //Press Tab in keyboard
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER); //Press enter key in keyboard
        Thread.sleep(3000);
        driver.quit();
    }
}

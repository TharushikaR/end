import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class DownloadZIPFile {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C://Intervest//My Work//Selenium//geckodriver-v0.32.0-win32//geckodriver.exe");

        //Creating Firefox profile object
        FirefoxProfile profile=new FirefoxProfile();
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip"); //Set the MIME types
        profile.setPreference("browser.download.manager.showWhenStarting",false);

        FirefoxOptions option=new FirefoxOptions();
        option.setProfile(profile);

        WebDriver driver = new FirefoxDriver(option);
        driver.manage().window().maximize();
        driver.get("http://testingmasters.com/student-corner/downloads/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"tablepress-7\"]/tbody/tr[1]/td[2]/a")).click();
        driver.close();
    }
}

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class FileDownloadFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C://Intervest//My Work//Selenium//geckodriver-v0.32.0-win32//geckodriver.exe");

        //Creating browser profile
        FirefoxProfile profile=new FirefoxProfile();
        profile.setPreference("browser.helperApps.neverAsk","text/plain"); //Set the MIME types
        profile.setPreference("browser.download.manager.showWhenStarting",false);

        FirefoxOptions option=new FirefoxOptions();
        option.setProfile(profile);

        WebDriver driver = new FirefoxDriver(option);
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/FileDownload.html");
        driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Testing");
        driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click(); //Generate txt file
        driver.findElement(By.id("link-to-download")).click(); //Display download

        driver.findElement(By.xpath("//*[@id=\"pdfbox\"]")).sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"createPdf\"]")).click(); //Generate PDF File
        driver.findElement(By.id("pdf-link-to-download")).click(); //Display download
        driver.quit();
    }
}

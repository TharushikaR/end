import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.io.*;

public class JavascriptExecutorDemo2 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        //Drawing a border
        WebElement joinfree=driver.findElement(By.xpath("//*[@id=\"gw-sign-in-button\"]/span/a"));
        JavaScriptUtil_1.drawBorder(joinfree,driver);
        //capture screenshot
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File target=new File("C://Intervest//My Work//Selenium//Notes//12-02//SS//Screenshot_1.jpg");
        FileUtils.copyFile(src,target);
    }
}

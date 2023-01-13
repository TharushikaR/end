import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import java.io.IOException;
//Firefox

public class FileUploadByAutoIT {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver", "C://Intervest//My Work//Selenium//geckodriver-v0.32.0-win32//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");

        WebElement button=driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));
        //First time
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",button);

        Runtime.getRuntime().exec("C://Intervest//My Work//Selenium//Notes//11-30//FileUpload1.exe"+" "+
                "C://Intervest//My Work//Selenium//Notes//11-29//Photos//Coffee_1.jpg"); //execute AutoIT exe file

        //second time
        js.executeScript("arguments[0].click();",button);

        Runtime.getRuntime().exec("C://Intervest//My Work//Selenium//Notes//11-30//FileUpload1.exe"+" "+
                "C://Intervest//My Work//Selenium//Notes//11-29//Photos//Coffee_2.jpg"); //execute AutoIT exe file

    }
}

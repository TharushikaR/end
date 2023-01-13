import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
//Chrome

public class FileUploadByAutoIT2 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");

        Actions builder = new Actions(driver);

        builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"))).click().build().perform(); //click on browse

        Runtime.getRuntime().exec("C://Intervest//My Work//Selenium//Notes//11-30//FileUpload1.exe"+" "+
                "C://Intervest//My Work//Selenium//Notes//11-29//Photos//Coffee_1.jpg"); //execute AutoIT exe file
       // driver.quit();
    }
}
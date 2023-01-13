import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadChrome {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.*;

public class FileUpload4 {
    public static void main(String[] args) throws InterruptedException, FindFailed {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html");

        driver.findElement(By.xpath("//*[@id=\"RESULT_FileUpload-10\"]")).click();

        String imagesFilePath="C://Intervest//My Work//Selenium//Notes//11-29//Photos//";
        String inputFilePath="C://Intervest//My Work//Selenium//Notes//11-29//Photos//";

        Screen s=new Screen();

        Pattern fileInputTextBox=new Pattern(imagesFilePath+"Coffee_3.JPG");
        Pattern openButton=new Pattern(imagesFilePath+"Coffee_2.JPG");

        Thread.sleep(5000);

        s.wait(fileInputTextBox,20);
        s.type(fileInputTextBox,inputFilePath+"Coffee_1.JPG");
        s.click(openButton);
    }
}

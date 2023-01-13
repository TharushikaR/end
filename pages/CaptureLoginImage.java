import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CaptureLoginImage {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nesh.lk/category/playtime-2");
        WebElement logoImageElement=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div[2]/div[3]/div/div[8]/a/div/img"));
        Screenshot logoImageScreenShot=new AShot().takeScreenshot(driver,logoImageElement);
        ImageIO.write(logoImageScreenShot.getImage(),"png",new File("C://Intervest//My Work//Selenium//Notes//12-02//SS//ToyImage.png"));
        File f=new File("C://Intervest//My Work//Selenium//Notes//12-02//SS//ToyImage.png");
        if (f.exists()){
            System.out.println("Image File Captured.");
        }else {
            System.out.println("Image File Not Exist.");
        }
    }
}

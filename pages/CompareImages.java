import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class CompareImages {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nesh.lk/category/playtime-2");
        BufferedImage expectedImage= ImageIO.read(new File("C://Intervest//My Work//Selenium//Notes//12-02//SS//ToyImage.png"));
        WebElement logoImageElement=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div[2]/div[3]/div/div[8]/a/div/img"));
        Screenshot logoImageScreenShot=new AShot().takeScreenshot(driver,logoImageElement);
        BufferedImage actualImage=logoImageScreenShot.getImage();
        ImageDiffer imgDiff=new ImageDiffer();
        ImageDiff diff=imgDiff.makeDiff(expectedImage,actualImage);
        if (diff.hasDiff()==true){
            System.out.println("Images are not same");
        }else {
            System.out.println("Images are same");
        }
        driver.quit();
    }
}

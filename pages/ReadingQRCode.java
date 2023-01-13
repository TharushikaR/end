import com.google.zxing.*;
import com.google.zxing.NotFoundException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ReadingQRCode {
    public static void main(String[] args) throws IOException, NotFoundException {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        String QRCodeURL=driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/img")).getAttribute("src");
        System.out.println(QRCodeURL);
        URL url=new URL(QRCodeURL);
        BufferedImage bufferedImage= ImageIO.read(url);
        LuminanceSource luminanceSource=new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource));
        Result result=new MultiFormatReader().decode(binaryBitmap);
        System.out.println(result.getText());
    }
}

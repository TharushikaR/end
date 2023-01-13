import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.Base64;

public class EncodeAndDecodePassword {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("Test@123gmail.com");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(decodePassword("VGVzdEAxMjM="));
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }

    static String decodePassword(String pswd){
        byte[] decodedString= Base64.getDecoder().decode(pswd);
        return (new String(decodedString));
    }
}

 /*    String str="Test@123";
        byte[] encodedString= Base64.getEncoder().encode(str.getBytes());
        System.out.println("Encoded String: "+new String(encodedString));
        byte[] decodedString= Base64.getDecoder().decode(encodedString);
        System.out.println("Decoded String: "+new String(decodedString));*/

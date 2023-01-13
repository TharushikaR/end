import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
public class HashMap_1 {
    static HashMap <String, String> loginData(){
        HashMap<String,String> pl=new HashMap<String,String>();
        pl.put("x","livetesttharushiunification@gmail.com@Rathnayaka@1995");
        pl.put("y","mercury1@mercury1");
        pl.put("z","mercury2@mercury2");
        return pl;
    }
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prelive-my.staysure.co.uk/signin");

        //Login as x
        String credintials=loginData().get("x");
        String arr[]=credintials.split("@");    //livetesttharushiunification@gmail.com    Rathnayaka@1995

        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(arr[0]);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(arr[1]);

        driver.findElement(By.xpath("//*[@id=\"signInBtn\"]")).click();

        //validation
        if (driver.getTitle().equals("Staysure")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
            System.out.println(driver.getTitle());
        }
        driver.findElement(By.linkText("")).click();
    }
}

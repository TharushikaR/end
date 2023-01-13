import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class SwitchingWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
        //System.out.println(driver.getTitle());
        Set <String>s=driver.getWindowHandles();  //get the IDs of available windows-return how many windows are open
        for (String i:s){
            System.out.println(i);
            String t=driver.switchTo().window(i).getTitle();
            System.out.println(t);
        }
        driver.quit();
    }
}

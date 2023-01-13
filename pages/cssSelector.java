import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class cssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/reg/");

        WebElement fname=driver.findElement(By.cssSelector("input[name=firstname]"));
        WebElement lname=driver.findElement(By.cssSelector("input[name=lastname]"));
        WebElement email=driver.findElement(By.cssSelector("input[name=reg_email__]"));
        WebElement pswd=driver.findElement(By.cssSelector("input[name=reg_passwd__]"));

        if(fname.isDisplayed() && fname.isEnabled()){
            fname.sendKeys("Test");
        }

        if(lname.isDisplayed() && lname.isEnabled()){
            lname.sendKeys("User");
        }

        if(email.isDisplayed() && email.isEnabled()){
            email.sendKeys("test@gmail.com");
        }
        if(pswd.isDisplayed() && pswd.isEnabled()){
            pswd.sendKeys("test@123");
        }

        driver.close();

    }
}

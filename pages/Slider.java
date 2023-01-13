import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/slider/");
        driver.switchTo().frame(0);
        WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        Actions act=new Actions(driver);
        act.moveToElement(slider).dragAndDropBy(slider,300,0).build().perform(); //drag the slider based on the dimensions
    }
}

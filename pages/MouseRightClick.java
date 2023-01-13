import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions act=new Actions(driver);

        WebElement btn=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
        act.contextClick(btn).build().perform();    //Right click on the element
        driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click(); //click copy option
        System.out.println(driver.switchTo().alert().getText());    //capture the text from alert box
        driver.switchTo().alert().accept();
    }
}

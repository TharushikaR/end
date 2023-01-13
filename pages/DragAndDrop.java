import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));

        Actions act=new Actions(driver);
       // act.clickAndHold(source).moveToElement(target).release().build().perform();
        act.dragAndDrop(source,target).build().perform();   //short method
    }
}

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownTest_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement element=driver.findElement(By.id("animals"));
        Select select=new Select(element);

        List originalList=new ArrayList();
        List <WebElement>options=select.getOptions();

        for (WebElement e:options){
            originalList.add(e.getText());
        }
        System.out.println(originalList);
        driver.close();
    }
}

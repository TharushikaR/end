import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownTest_3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.id("animals"));
        Select select=new Select(element);
        List originalList=new ArrayList();
        List tempList=new ArrayList();

        List <WebElement>options=select.getOptions();
        for (WebElement e:options){
            originalList.add(e.getText());
            tempList.add(e.getText());
        }
        System.out.println("Before sorting Original list: "+originalList);
        System.out.println("Before sorting Temp list: "+tempList);
        Collections.sort(tempList);
        System.out.println("After sorting Original list: "+originalList);
        System.out.println("After sorting Temp list: "+tempList);

        if (originalList==tempList){
            System.out.println("Dropdown sorted.");
        }else {
            System.out.println("Dropdown not sorted.");
        }

        driver.close();

    }
}

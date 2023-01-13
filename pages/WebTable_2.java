import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")).click();

        Select item=new Select(driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]/option[2]")));
        item.selectByVisibleText("Morning");

        driver.close();
    }
}

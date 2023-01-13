import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/selenium/newtours/index.php");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        String text=driver.findElement(By.xpath(
                "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
        System.out.println(text);

       // driver.close(); //close only the current window
        driver.quit(); //close multiple windows at one time
    }
}

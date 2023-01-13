import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod_2 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Windows.html");

       // System.out.println(driver.getTitle());

      //  System.out.println(driver.getCurrentUrl());

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();


         //driver.close(); //close only the current window
        driver.quit(); //close multiple windows at one time
    }
}

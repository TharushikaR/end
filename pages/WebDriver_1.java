import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");

        //ChromeDriver driver=new ChromeDriver(); //invoke the Chrome browser
        WebDriver webDriver=new ChromeDriver(); //invoke the multiple browsers-generic way

        webDriver.get("https://demo.guru99.com/selenium/newtours/login.php"); //open url

        webDriver.findElement(By.name("userName")).sendKeys("RMPTR95");
        webDriver.findElement(By.name("password")).sendKeys("rmptr@95");

        /*WebElement userName=webDriver.findElement(By.name("userName"));
        userName.sendKeys("Tharushi");*/

        webDriver.findElement(By.name("submit")).click();

        String expectedTitle="Find a Flight";

        String actualTitle=webDriver.getTitle();   //return the title of the page

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}

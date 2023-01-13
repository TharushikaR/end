import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Login
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        //admin module
        Actions actions=new Actions(driver);
        WebElement admin=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
        WebElement usermgmt=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span"));
        WebElement user=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li"));

       // actions.moveToElement(admin).build().perform(); //Mouseover to admin tab
       // actions.moveToElement(usermgmt).build().perform(); //Mouseover to usermgmt tab
       // actions.moveToElement(user).click().build().perform(); //Mouseover to user tab & click the element

        actions.moveToElement(admin).moveToElement(usermgmt).moveToElement(user).click().build().perform(); //short method

    }
}

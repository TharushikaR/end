/*TEST CASE
-------------------
1-Login to Orange HRM / 2-Go to Admin->User Management->Users / 3-Count the Employees whose status is enabled in WebTable
 */
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //Login
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        //admin module
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li")).click();

       // Dimension rowCount=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div")).getSize();
        int statusCount=0;
       /* for (int i=1,i<=rowCount;i++){
            String status=driver.findElement(By.xpath("")).getText();
            if (status.equals("Enabled")){
                statusCount=+1;
            }
        }*/
        System.out.println("No. of employees Enabled: "+statusCount);
        driver.close();
    }
    }

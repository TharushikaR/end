import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class MSEdgeTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C://Intervest//My Work//Selenium//edgedriver_win64//msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://prelive-my.staysure.co.uk/signin");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("livetesttharushiunification@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rathnayaka@1995");
        driver.findElement(By.xpath("//*[@id=\"signInBtn\"]")).click();
        String expectTitle="MyStaysure";
        String actualTitle=driver.getTitle();
        if (expectTitle.equals(actualTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
            System.out.println("Expected Title : "+expectTitle);
            System.out.println("Actual Title : "+actualTitle);
        }
        driver.quit();
    }
}

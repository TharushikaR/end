import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class HandlingWebElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html");
        driver.manage().window().maximize();

        //Text Boxes
        driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Test1");
        driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Test2");
        driver.findElement(By.id("RESULT_TextField-3")).sendKeys("1234567890");
        driver.findElement(By.id("RESULT_TextField-4")).sendKeys("Sri Lanka");
        driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Colombo");
        driver.findElement(By.id("RESULT_TextField-6")).sendKeys("Test@gmail.com");

        //Radio Buttons
        System.out.println(driver.findElement(By.id("RESULT_RadioButton-7_0")).isSelected()); //return false
        WebElement elementRadio = driver.findElement(By.id("RESULT_RadioButton-7_0"));
        Actions actionsRadio = new Actions(driver);
        actionsRadio.moveToElement(elementRadio).click().build().perform();

        //Check boxes
        WebElement elementCheckBox1 =driver.findElement(By.id("RESULT_CheckBox-8_0"));
        Actions actionsCheckBox1 = new Actions(driver);
        actionsCheckBox1.moveToElement(elementCheckBox1).click().build().perform();

        WebElement elementCheckBox2 =driver.findElement(By.id("RESULT_CheckBox-8_2"));
        Actions actionsCheckBox2 = new Actions(driver);
        actionsCheckBox2.moveToElement(elementCheckBox2).click().build().perform();

        WebElement elementCheckBox3 =driver.findElement(By.id("RESULT_CheckBox-8_5"));
        Actions actionsCheckBox3 = new Actions(driver);
        actionsCheckBox3.moveToElement(elementCheckBox3).click().build().perform();

        //Drop down
        WebElement contactTime=driver.findElement(By.id("RESULT_RadioButton-9"));
        Select contactTimeDrp=new Select(contactTime);
        //contactTimeDrp.selectByIndex(1);    //by index
        //contactTimeDrp.selectByValue("Radio-0");    //by value
        contactTimeDrp.selectByVisibleText("Morning");  //by visible text

        System.out.println(contactTimeDrp.getOptions().size()); //no.of items present in the dropdown box


        //Links
        if (driver.findElement(By.linkText("Software Testing Tutorials")).isDisplayed()==true)
            driver.findElement(By.linkText("Software Testing Tutorials")).click();

        driver.navigate().back();

        driver.findElement(By.id("FSsubmit")).click();
    }
}

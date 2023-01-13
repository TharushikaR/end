import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConditionalCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/reg/");

        WebElement fname=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input"));//Xpath-->WORKING-->ABSOLUTE XPATH
        WebElement lname=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
        WebElement email=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
        WebElement pswd=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));

        if(fname.isDisplayed() && fname.isEnabled()){
            fname.sendKeys("Test");
        }

        if(lname.isDisplayed() && lname.isEnabled()){
            lname.sendKeys("User");
        }

        if(email.isDisplayed() && email.isEnabled()){
            email.sendKeys("test@gmail.com");
        }
        if(pswd.isDisplayed() && pswd.isEnabled()){
            pswd.sendKeys("test@123");
        }

        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).isSelected()); //return false //male
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).isSelected()); //return false //female
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[3]/label")).isSelected()); //return false //custom

        if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).isSelected()==false){
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
        }

        driver.close();
    }

    // WebElement fname=driver.findElement(By.xpath("//*[@id=\"u_0_b_gE\"]"));--NOT WORKED-->RELATIVE XPATH
    //driver.findElement(By.xpath("//*[@id=\"email\"]")).isDisplayed();
    //WebElement fname=driver.findElement(By.cssSelector("input#u_0_b_gE")); //Tag+ID-->NOT WORKED
    //WebElement fname=driver.findElement(By.cssSelector("input.inputtext _58mg _5dba _2ph-")); //Tag+Class Name-->NOT WORKED
    //WebElement fname=driver.findElement(By.cssSelector("input[name=firstname]")); //Tag+Attribute Name-->WORKING
    //   WebElement fname=driver.findElement(By.cssSelector("input.inputtext _58mg _5dba _2ph-[tabindex=2]")); //Tag+Class+Attribute Name-->NOT TRIED
    //WebElement fname=driver.findElement(By.cssSelector("font:contains("Password:")")); //Inner Text-->NOT TRIED
}

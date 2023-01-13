import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import java.net.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinks {
    public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for 10 secs
        driver.get("https://demo.guru99.com/selenium/newtours/index.php");
        Thread.sleep(5000); //wait
        List <WebElement> links=driver.findElements(By.tagName("a")); //capture links from a webpage // List <WebElement> links=driver.findElements(By.linkText("a"));
        System.out.println(links.size()); //Number of links
        for (int i=0;i< links.size();i++){
            //by using href attribute we can get URL of required links
            WebElement element=links.get(i);
            String url=element.getAttribute("href");
            URL link=new URL(url);
            HttpURLConnection httpConn=(HttpURLConnection) link.openConnection(); //create a connection using url object 'link'
            Thread.sleep(2000); //wait time 2 seconds
            httpConn.connect(); //establish connection
            int responseCode=httpConn.getResponseCode(); //return response code, if response code is above 400: broken link
            if (responseCode>=400){
                System.out.println(url+ " - "+" is broken link");
            }else {
                System.out.println(url+ " - "+" is valid link");
            }
        }
    }
}

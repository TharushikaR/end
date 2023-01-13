import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");

        ChromeOptions options=new ChromeOptions();
        // options.setHeadless(true);
        options.addArguments("--headless");

        WebDriver webDriver=new ChromeDriver(options); //invoke the multiple browsers-generic way

        webDriver.get("https://demo.nopcommerce.com/");

        System.out.println("Title "+webDriver.getTitle());

    }
}

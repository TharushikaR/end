import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "C://Intervest//My Work//Selenium//geckodriver-v0.32.0-win32//geckodriver.exe");

        FirefoxOptions options=new FirefoxOptions();
        // options.setHeadless(true);
        options.addArguments("--headless");

        WebDriver webDriver=new FirefoxDriver(options); //invoke the multiple browsers-generic way

        webDriver.get("https://demo.nopcommerce.com/");

        System.out.println("Title "+webDriver.getTitle());

    }
}

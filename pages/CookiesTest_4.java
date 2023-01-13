import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.Set;

public class CookiesTest_4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Set<Cookie> cookies=driver.manage().getCookies(); //capture all the cookies in this browser
        System.out.println("Size of the cookies "+cookies.size()); //return the count cookies
        Cookie cobj=new Cookie("mycookie","1234567890"); //create new cookie object
        driver.manage().addCookie(cobj); //add new cookie to the browser
        cookies=driver.manage().getCookies();
        System.out.println("Size of the cookies "+cookies.size()); //return the count cookies
        for (Cookie cookie:cookies){ //read & print all the cookies
            System.out.println(cookie.getName()+":"+cookie.getValue()); //Print names & values of cookies
        }
        //delete a specific cookies
        driver.manage().deleteCookie(cobj);
        driver.quit();
    }
}

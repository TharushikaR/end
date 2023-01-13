/*
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.*;
import java.io.File;
import java.util.HashMap;

public class FileDownloadAndExistMethod {
    public static void main(String[] args) throws InterruptedException {
        //Download files in required location using chrome
        HashMap<String, Object> chromePrefs=new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups",0);
        chromePrefs.put("download.prompt_for_download","false");
        chromePrefs.put("download.default_directory","C://Users//User//Downloads//"); //configure path

        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("prefs",chromePrefs);

        DesiredCapabilities cap=DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        cap.setCapability(ChromeOptions.CAPABILITY,options); //end of code


        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver(cap);
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/FileDownload.html");
        driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Testing");
        driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click(); //Generate txt file
        driver.findElement(By.id("link-to-download")).click(); //Display download

        Thread.sleep(5000);

        if(isFileExist("C://Users//User//Downloads//info.txt")){
            System.out.println("File Exists");
        }else {
            System.out.println("File Not Exists");
        }

        driver.findElement(By.xpath("//*[@id=\"pdfbox\"]")).sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"createPdf\"]")).click(); //Generate PDF File
        driver.findElement(By.id("pdf-link-to-download")).click(); //Display download

        Thread.sleep(5000);

        if(isFileExist("C://Users//User//Downloads//info.pdf")){
            System.out.println("File Exists");
        }else {
            System.out.println("File Not Exists");
        }
        driver.quit();
    }

    static boolean isFileExist(String path){
        File f=new File(path);
        if (f.exists()){
            return true;
        }else {
            return false;
        }
    }
}
*/

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import java.io.File;

public class FileDownloadAndExistMethod2 {
    public static void main(String[] args) throws InterruptedException {
        FirefoxProfile profile=new FirefoxProfile();
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain,application/pdf"); //Set the MIME types
        profile.setPreference("browser.download.manager.showWhenStarting",false);

        //download files in desired location
        profile.setPreference("browser.download.dir","C://Users//User//Downloads//");
        profile.setPreference("browser.download.folderList",2);
        profile.setPreference("pdfjs.disabled",true); //only for pdf file

        FirefoxOptions options=new FirefoxOptions();
        options.setProfile(profile);

        System.setProperty("webdriver.gecko.driver", "C://Intervest//My Work//Selenium//geckodriver-v0.32.0-win32//geckodriver.exe");
        WebDriver driver = new FirefoxDriver(options);
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

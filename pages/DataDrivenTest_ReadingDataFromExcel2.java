import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.*;

public class DataDrivenTest_ReadingDataFromExcel2 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/selenium/newtours/index.php");

        FileInputStream fileInputStream=new FileInputStream("C://Intervest//My Work//Selenium//Notes//11-24//Book1.xlsx"); //Excel location
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream); //access work book
        XSSFSheet sheet=workbook.getSheet("Sheet2"); //access sheet - can provide sheet name
        int rowCount=sheet.getLastRowNum(); //return row count
        System.out.println("No. of records in the excel sheet"+rowCount);

        for (int i=1;i<rowCount;i++){ //i=1, because first row is header row
            XSSFRow currentRow=sheet.getRow(i);    //Focused on current row based on i value

            String firstName=currentRow.getCell(0).getStringCellValue();
            String lastName=currentRow.getCell(1).getStringCellValue();
            String phone=currentRow.getCell(2).getStringCellValue();
            String email=currentRow.getCell(3).getStringCellValue();
            String address=currentRow.getCell(4).getStringCellValue();
            String city=currentRow.getCell(5).getStringCellValue();
            String state=currentRow.getCell(6).getStringCellValue();
            String postalCode=currentRow.getCell(7).getStringCellValue();
            String country=currentRow.getCell(8).getStringCellValue();
            String userName=currentRow.getCell(9).getStringCellValue();
            String password=currentRow.getCell(10).getStringCellValue();

            //Registration process
            driver.findElement(By.linkText("REGISTER")).click();

            //Entering contact Info.
            driver.findElement(By.name("firstName")).sendKeys(firstName);
            driver.findElement(By.name("lastName")).sendKeys(lastName);
            driver.findElement(By.name("phone")).sendKeys(phone);
            driver.findElement(By.name("userName")).sendKeys(email);

            //Entering mailing Info.
            driver.findElement(By.name("address1")).sendKeys(address);
            driver.findElement(By.name("city")).sendKeys(city);
            driver.findElement(By.name("state")).sendKeys(state);
            driver.findElement(By.name("postalCode")).sendKeys(postalCode);

            //Country selection
            Select dropCountry=new Select(driver.findElement(By.name("country")));
            dropCountry.selectByVisibleText(country);

            //Entering user Info.
            driver.findElement(By.name("email")).sendKeys(userName);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.name("confirmPassword")).sendKeys(password);

            //Submitting Form.
            driver.findElement(By.name("submit")).click();

            if (driver.getPageSource().contains("Thank you for Registering")){
                System.out.println("Registration completed for "+rowCount+" record.");
            }else {
                System.out.println("Registration failed for "+rowCount+" record.");
            }
        }
    }
}

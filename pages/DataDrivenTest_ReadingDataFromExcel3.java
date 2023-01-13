import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.*;

public class DataDrivenTest_ReadingDataFromExcel3 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C://Intervest//My Work//Selenium//chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("");

        FileInputStream fileInputStream=new FileInputStream("C://Intervest//My Work//Selenium//Notes//11-24//Book1.xlsx"); //Excel location
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream); //access work book
        XSSFSheet sheet=workbook.getSheet("Sheet3"); //access sheet - can provide sheet name
        int rowCount=sheet.getLastRowNum(); //return row count
        System.out.println("No. of records in the excel sheet"+rowCount);

        for (int i=1;i<rowCount;i++){ //i=1, because first row is header row
            XSSFRow currentRow=sheet.getRow(i);    //Focused on current row based on i value

            XSSFCell principleCell=currentRow.getCell(0);
            int princ=(int)principleCell.getNumericCellValue();

            XSSFCell roi=currentRow.getCell(1);
            int rateOfInterest=(int)roi.getNumericCellValue();

            XSSFCell period=currentRow.getCell(2);
            int per=(int)period.getNumericCellValue();

            XSSFCell Frequency=currentRow.getCell(3);
            String Freq=Frequency.getStringCellValue();

            XSSFCell MaturityValue=currentRow.getCell(4);
            int Exp_value=(int)MaturityValue.getNumericCellValue();


            driver.findElement(By.name("")).sendKeys(String.valueOf(princ));
            driver.findElement(By.name("")).sendKeys(String.valueOf(rateOfInterest));
            driver.findElement(By.name("")).sendKeys(String.valueOf(per));

            Select periodCombo=new Select(driver.findElement(By.name("")));
            periodCombo.selectByVisibleText("year (s)");

            Select frequency=new Select(driver.findElement(By.name("")));
            frequency.selectByVisibleText(Freq);

            driver.findElement(By.xpath("")).click();

           // String actual_mvalue=driver.findElement((By.xpath(""));


            if (driver.getPageSource().contains("Thank you for Registering")){
                System.out.println("Registration completed for "+rowCount+" record.");
            }else {
                System.out.println("Registration failed for "+rowCount+" record.");
            }


        }

    }
}

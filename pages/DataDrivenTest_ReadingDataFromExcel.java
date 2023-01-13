import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class DataDrivenTest_ReadingDataFromExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("C://Intervest//My Work//Selenium//Notes//11-24//Book1.xlsx"); //Excel location
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream); //access work book
        XSSFSheet sheet=workbook.getSheet("Sheet1"); //access sheet - can provide sheet name
        //XSSFSheet sheet=workbook.getSheetAt(0); //can provide sheet index
        int rowCount=sheet.getLastRowNum(); //return row count
        int colCount=sheet.getRow(0).getLastCellNum(); //No. of cells in a row=return columns count
        for (int i=0;i<rowCount;i++){
            XSSFRow currentRow=sheet.getRow(i);    //Focused on current row based on i value
            for (int y=0;y<colCount;y++){
                String value=currentRow.getCell(y).toString();   //read the value from a cell //toString()-int,string,double value return
                System.out.print("   "+value);
            }
            System.out.println();
        }

    }
}

//   System.setProperty("log4j.configurationFile","./path_to_the_log4j2_config_file/log4j2.xml");

// Logger log = LogManager.getLogger(LogExample.class.getName());

//import org.apache.logging.log4j.*;

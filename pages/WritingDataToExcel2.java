import org.apache.poi.xssf.usermodel.*;
import java.io.*;

public class WritingDataToExcel2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C://Intervest//My Work//Selenium//Notes//11-24//Book3.xlsx"); //Excel location
        XSSFWorkbook workbook = new XSSFWorkbook(); //access work book
        XSSFSheet sheet_1=workbook.createSheet("Data_1");
        XSSFSheet sheet_2=workbook.createSheet("Data_2");
        for (int i=0;i<=5;i++){
            XSSFRow row_1=sheet_1.createRow(i);
            XSSFRow row_2=sheet_2.createRow(i);
            for (int j=0;j<3;j++){
                row_1.createCell(j).setCellValue("XYZ");
                row_2.createCell(j).setCellValue("ABC");
            }
        }
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        System.out.println("Data written to Excel is completed.");
    }
}


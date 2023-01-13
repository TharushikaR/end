import org.apache.poi.xssf.usermodel.*;
import java.io.*;

public class WritingDataToExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C://Intervest//My Work//Selenium//Notes//11-24//Book2.xlsx"); //Excel location
        XSSFWorkbook workbook = new XSSFWorkbook(); //access work book
        XSSFSheet sheet=workbook.createSheet("Data");
        for (int i=0;i<=5;i++){
            XSSFRow row=sheet.createRow(i);
            for (int j=0;j<3;j++){
                row.createCell(j).setCellValue("XYZ");
            }
        }
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        System.out.println("Data written to Excel is completed.");
    }
}

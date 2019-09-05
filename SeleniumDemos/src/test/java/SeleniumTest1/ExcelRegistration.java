package SeleniumTest1;

/*import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CS1 {
 public static Object[][] readData() throws IOException{
  FileInputStream fis=new FileInputStream("C:\\Users\\Training_B6B.01.07\\Desktop\\eclipse2\\eclipse\\Registeration.xlsx");
    XSSFWorkbook wb=new XSSFWorkbook(fis);
    XSSFSheet sheet1=wb.getSheetAt(0);
    int rowCount=sheet1.getPhysicalNumberOfRows();
    XSSFRow row1=sheet1.getRow(0);
    int colCount=row1.getPhysicalNumberOfCells();
    
    Object[][] data=new Object[rowCount][colCount];
    for(int i=0;i<rowCount;i++) {
     for(int j=0;j<colCount;j++) {
      data[i][j]=sheet1.getRow(i).getCell(j).getStringCellValue();
     }
    }
    return data;
 }

}*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExcelRegistration {
@Test
public static Object[][] readData() throws IOException
{
  FileInputStream fi=new FileInputStream("C:\\Users\\a.ningayya.salimath\\Selenium week 3\\casestudyexcel.xlsx");
  XSSFWorkbook wb=new XSSFWorkbook(fi);
  XSSFSheet sheet=wb.getSheetAt(1);
  int rc=sheet.getPhysicalNumberOfRows();
  XSSFRow row=sheet.getRow(0);
  int cc=row.getPhysicalNumberOfCells();
  System.out.println(rc);
  System.out.println(cc);
  Object[][] data=new Object[rc][cc];
  for(int i=0;i<rc;i++)
  {
   for(int j=0;j<cc;j++)
   {
    if(j==7 || j==9 || j==10) {
          data[i][j]=Integer.toString((int)sheet.getRow(i).getCell(j).getNumericCellValue());
    }
    else {
     data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
    }
   }
  }
  return data;
}
}

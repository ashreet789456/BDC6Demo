package SeleniumTest1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writetoExcel {
  @Test
  public void writeExcel() throws IOException 
  {
	  	FileInputStream fis=new FileInputStream("C:\\Users\\a.ningayya.salimath\\Selenium week 3\\selenium.xlsx");
	  	XSSFWorkbook wb=new XSSFWorkbook(fis);
	  	XSSFSheet sheet1=wb.getSheetAt(0);
	  	sheet1.getRow(0).createCell(2).setCellValue("valid user");
	  	sheet1.getRow(1).createCell(2).setCellValue("valid user");
	  	FileOutputStream fos=new FileOutputStream("C:\\Users\\a.ningayya.salimath\\Selenium week 3\\selenium.xlsx");
	  	wb.write(fos);
	  	
  }
}

package SeleniumTest1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class selenium_excel 
{
  @Test
  public void testExcel() throws IOException 
  {
	  	FileInputStream fis=new FileInputStream("C:\\Users\\a.ningayya.salimath\\Selenium week 3\\selenium.xlsx");
	  	XSSFWorkbook wb=new XSSFWorkbook(fis);
	  	XSSFSheet sheet1=wb.getSheetAt(0);
	  	//XSSFSheet sheet2=wb.getSheetAt(0);
	  	int rowCount=sheet1.getPhysicalNumberOfRows();
	  	XSSFRow row1=sheet1.getRow(0);
	  	int colCount=row1.getPhysicalNumberOfCells();
	  	for(int i=0;i<rowCount;i++) {
	  		for(int j=0;j<colCount;j++){
	  			String value=sheet1.getRow(i).getCell(j).getStringCellValue();
	  			System.out.println(value);
	  		}
	  		
	  	}
	  	
  }
}

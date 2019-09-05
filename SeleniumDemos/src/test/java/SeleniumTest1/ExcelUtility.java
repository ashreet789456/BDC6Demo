package SeleniumTest1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{

	public static Object[][] readData() throws IOException 
	{
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\a.ningayya.salimath\\Selenium week 3\\selenium.xlsx");
	  	XSSFWorkbook wb=new XSSFWorkbook(fis);
	  	XSSFSheet sheet1=wb.getSheetAt(0);
	  	int rowCount=sheet1.getPhysicalNumberOfRows();
	  	XSSFRow row1=sheet1.getRow(0);
	  	int colCount=row1.getPhysicalNumberOfCells();
	  	Object[][] data=new Object[rowCount][colCount];
	  	for(int i=0;i<rowCount;i++) {
	  		for(int j=0;j<colCount;j++){
	  			data[i][j]=sheet1.getRow(i).getCell(j).getStringCellValue();
	  			
	  		}
	
	}
		return data;
	}

}

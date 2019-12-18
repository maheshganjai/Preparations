package webdriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		 FileInputStream fis = new FileInputStream("F:\\OptumPre\\TestData\\DataDriven.xlsx");
	     XSSFWorkbook book = new XSSFWorkbook(fis);
	     XSSFSheet sh = book.getSheetAt(0);
	     
	     System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
	}

}

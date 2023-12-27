package SELENIIUM_COMMANDS;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\testdata2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		int row = sheet.getLastRowNum();
		row= row+1;
		int col = sheet.getRow(0).getLastCellNum();
		
		System.out.println("No.of Rows " + row);
		System.out.println("No of Col " + col);
		
		for(int r = 0; r<row;r++) {
			XSSFRow row1 =	sheet.getRow(r);
		
		for(int c = 0; c<col;c++) {
			XSSFCell cell =	row1.getCell(c);
			System.out.println(cell + " ");
				
			}
		}
		
		workbook.close();
		fis.close();

	}

}

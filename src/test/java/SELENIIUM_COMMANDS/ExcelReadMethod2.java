package SELENIIUM_COMMANDS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadMethod2 {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("E:\\testdata2.xlsx"); 
        XSSFWorkbook wb=new XSSFWorkbook(file); 
        XSSFSheet sheet=wb.getSheet("Sheet2"); 
   
        // Iterate each row one by one 
        Iterator<Row> itr = sheet.iterator(); 
        while (itr.hasNext())  
        { 
            Row row = itr.next(); 
                           
            Iterator<Cell> Cell = row.cellIterator();   // For each row, iterate through all the columns 
               
            while (Cell.hasNext())  
            { 
                Cell cell = Cell.next();                 
                  		
					  switch(cell.getCellType()) 
					  {					  
					  case STRING:
						  System.out.print(cell.getStringCellValue());					  
					  default:
						  break;					  					  
						
						  case NUMERIC:
							  System.out.print(cell.getNumericCellValue()); 
							  break;
						  
						  case FORMULA: 
							  System.out.print(cell.getNumericCellValue()); 
							  break;
						 
					  
					  }					  
                System.out.print("|"); 
            } 
            System.out.println();               
        } 
        wb.close(); 
        file.close(); 
} 
}

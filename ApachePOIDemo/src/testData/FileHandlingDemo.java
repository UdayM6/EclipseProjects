package testData;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class FileHandlingDemo {
	
	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	private static MissingCellPolicy xRow;
	
	
	public static void setExcelFile (String path, String sheetName) throws Exception{
		try {
			FileInputStream file = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(file);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
		}catch(Exception e) {
			throw(e);
	}
		Cell = ExcelWSheet.getRow(1).getCell(1);
		String cellData = Cell.getStringCellValue();
		
		// to write into cell
		Row = ExcelWSheet.getRow(1);
		Cell = Row.getCell(1, xRow.RETURN_BLANK_AS_NULL);
		if (Cell==null) {
			Row.createCell(1);
			Cell.setCellValue("setColumn");
		}
		else {
			Cell.setCellValue("setColumn");
		}
		
		FileOutputStream fileOut = new FileOutputStream(path);
		ExcelWBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}	
}

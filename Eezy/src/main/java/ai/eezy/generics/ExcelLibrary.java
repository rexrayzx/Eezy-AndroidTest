package ai.eezy.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Rajiv
 *
 */
public class ExcelLibrary {
	/**
	 * to get the data from excel
	 * @param sheetName
	 * @param rownum
	 * @param columnNum
	 * @return String
	 * @throws Throwable
	 * @throws IOException
	 */
	public String getExcelData(String sheetName,int rownum,int columnNum) throws Throwable{
		FileInputStream fis=new FileInputStream(PathConstant.excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row = sh.getRow(rownum);
		wb.close();
		return row.getCell(columnNum).getStringCellValue();
	}
	
	/**
	 * to write the data in excel
	 * @param sheetname
	 * @param rowNum
	 * @param colNum
	 * @param data
	 * @throws Throwable
	 * @throws IOException
	 */
	
	public void setExcelData(String sheetname,int rowNum,int colNum, String data) throws Throwable {
		FileInputStream fis=new FileInputStream(PathConstant.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(colNum);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(PathConstant.excelPath);
		wb.write(fos);
		wb.close();
	}
	
	/**
	 * to get the number of rows which are containing the data
	 * @param sheetName
	 * @return total number of row used
	 * @throws Throwable
	 * @throws IOException
	 * @return int
	 */
	
	public int getRowCount(String sheetName) throws Throwable{
		FileInputStream fis=new FileInputStream(PathConstant.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		return sh.getLastRowNum();
	}
}

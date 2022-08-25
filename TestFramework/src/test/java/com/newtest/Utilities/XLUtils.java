package com.newtest.Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {

	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public int getRowCount(String xlfile, String sheetnm) throws IOException
	{
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetnm);
		int rowCount=sheet.getLastRowNum();
		wb.close();
		fis.close();
		return rowCount;
		
	}
	public int getCellCount(String xlfile, String sheetnm, int rowCount) throws IOException
	{
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetnm);
		row=sheet.getRow(rowCount);
		int cellCount=row.getLastCellNum();
		wb.close();
		fis.close();
		return cellCount;
	}
	public String getCellData(String xlfile, String sheetnm, int rowCount, int cellCount) throws IOException
	{
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetnm);
		row=sheet.getRow(rowCount);
		cell=row.getCell(cellCount);
		
		DataFormatter formatter=new DataFormatter();
		String data;
		try {
			data=formatter.formatCellValue(cell);
		}
		catch(Exception E)
		{
			data="";
		}
		wb.close();
		fis.close();
		return data;
		
	}
	
	
}

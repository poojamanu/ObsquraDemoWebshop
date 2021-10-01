package com.demowebshop.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.demowebshop.constants.Constants;

public class ExcelUtility {
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static FileInputStream f;

	public static ArrayList<String> getString() throws IOException {
		f = new FileInputStream("C:\\Users\\manua\\eclipse-workspace\\obsquraselenium\\src\\main\\resources\\CountryList.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		ArrayList<String> ExcelRows = new ArrayList<String>();
		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		int columnCount = 1;
		for (int i = 0; i < rowCount; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				ExcelRows.add(row.getCell(j).getStringCellValue());
			}
		}

		f.close();
		return ExcelRows;

	}
	public static String getString(int i,int j) throws IOException
	{
		f=new FileInputStream(System.getProperty("user.dir") + Constants.DEMOcREDENTIALS );
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		return c.getStringCellValue();
		
	}
}

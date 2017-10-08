package com.testing.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {
	public static String getDataProperties(String filename,String Key)
	{
		String value = null;
		try
		{
			File f = new File("./test-config-data/"+ filename+ ".properties");
			FileInputStream fis = new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(fis);
			value = (String)prop.get(Key);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;				
	}
	public static String getDataFromWorkbook(String filename,int lastRowIndex,int lastCellIndex,String SheetName)
	{
		String value = null;
		try
		{
			File f = new File("./testdata/"+ filename+ ".xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(SheetName);
			Row r = st.getRow(lastRowIndex);
			Cell c = r.getCell(lastCellIndex);
			value = c.toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;	
}
}

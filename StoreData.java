package com.testing.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StoreData {
	public static void writeFromProperties(String filename,String Key, String Value,String comment)
	{
		try
		{
			File f = new File("./test-config-data"+filename+".properties");
			FileInputStream fis = new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(fis);
			prop.setProperty(Key, Value);
			FileOutputStream fos = new FileOutputStream(f);
	        prop.store(fos, comment);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void writeFromWrokbook(String filename,int lastRowIndex,int lastCellIndex,String SheetName,String data)
	{
		try
		{
			File f = new File("./test-data"+filename+".xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(SheetName);
			Row r = st.getRow(lastRowIndex);
			Cell c = r.getCell(lastCellIndex);
			c.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

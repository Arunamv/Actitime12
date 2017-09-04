package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File file=new File("./data/input.xlsx");
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh=wb.getSheet("sheet1");
		int rn = sh.getLastRowNum();
		//System.out.println("count row:"+rn);
		
		Row r=sh.getRow(0);
		short cn = r.getLastCellNum();
		//System.out.println("count cell:"+cn);
		for(int i=0;i<=rn;i++)
		{
			for(int j=0;j<cn;j++)
			{
				 String data = sh.getRow(i).getCell(j).toString();
				 System.out.println(data+"");
			}
			System.out.println();
		}
		
		
		//Cell c=r.getCell(0);
		//String data=c.getStringCellValue();
		//System.out.println(data);
	}
}

package Testcase;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testdata {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public Testdata()
	{
	try
	{
		File src = new File("D:\\finalAssignment.xlsx");
		FileInputStream fs = new FileInputStream(src);
		
		wb=new XSSFWorkbook(fs);
	}
	catch(Exception e)
	{
		
		System.out.println(e.getMessage());
	
	}
			
	}	

	public String getdata(int sheetnum,int rownum,int cloumnnum)
	{
		sheet1 = wb.getSheetAt(sheetnum);
		String data = sheet1.getRow(rownum).getCell(cloumnnum).getStringCellValue();
		return data;
		
	}
}

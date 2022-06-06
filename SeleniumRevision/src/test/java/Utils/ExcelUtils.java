package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {


	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public  ExcelUtils(String excelpath,String sheetname)
	{
		try
		{
			projectpath=System.getProperty("user.dir");
			workbook =new XSSFWorkbook(excelpath);
			sheet=workbook.getSheet(sheetname);	
		}
		catch(Exception e)
		{
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {

		getrowcount();
		getcolcount();
		getcelldatanum(1,0);
		getcelldatastring(1,1);
	}


	public static int getrowcount()
	{
		int rowcount=0;
		try
		{


		rowcount=sheet.getPhysicalNumberOfRows();
			//System.out.println(rowcount);

		}
		catch(Exception e)
		{
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
		return rowcount;
	}

	public static int getcolcount()
	{
		int colcount=0;
		try
		
		{

		colcount=sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println(colcount);

		}
		catch(Exception e)
		{
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
		return colcount;
	}

	public static void getcelldatanum(int rownum,int colnum)
	{
		try
		{

			double rowdatanum=sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			//System.out.println(rowdatanum);

		}
		catch(Exception e)
		{
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
	}

	public static String getcelldatastring(int rownum,int colnum)
	{
		String rowdatastring=null;
		try
		{


		 rowdatastring=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			//System.out.println(rowdatastring);

		}
		catch(Exception e)
		{
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
		return rowdatastring;
	}


}

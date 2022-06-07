package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectpath=System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;



	public ExcelUtils(String excelpath, String sheetname) {
	
			try
			{
			
				workbook=new XSSFWorkbook (excelpath);
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

	public static void getrowcount()
	{
		try
		{

			int rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println(rowcount);
		}
		catch(Exception e)
		{
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
	}

	public static void getcolcount()
	{
		try
		{

			int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println(colcount);
		}
		catch(Exception e)
		{
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}

	}


	public static void getcelldatanum(int rownum,int colnum)
	{
		try
		{

			double celldatanum=sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			System.out.println(celldatanum);
		}
		catch(Exception e)
		{
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}

	}

	public static void getcelldatastring(int rownum,int colnum)
	{
		try
		{

			String celldatastring=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.println(celldatastring);
		}
		catch(Exception e)
		{
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}

	}

}

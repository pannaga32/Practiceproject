package Utils;

public class ExcelDataProvider {
	
	public static void main(String[] args) {
		
		
		String projectpath=projectpath=System.getProperty("user.dir");
		String excelpath=projectpath+"\\Excel\\AssignData.xlsx";
		getdata(excelpath,"Sheet1");
		
		
	}
	
	
	
	public static void getdata(String excelpath,String sheetname)
	{

	ExcelUtils excel=new ExcelUtils(excelpath,sheetname);
	int rowcount=excel.getrowcount();
	int colcount=excel.getcolcount();
	
	for(int i=1;i<rowcount;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			String celldatastring=excel.getcelldatastring(i, j);
			System.out.print(celldatastring +  " | ");
		}
		System.out.println( );
	}
	
	
	

}
}

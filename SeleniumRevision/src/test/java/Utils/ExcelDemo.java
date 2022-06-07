package Utils;

public class ExcelDemo {

	public static void main(String[] args) {
		
		String projectpath=System.getProperty("user.dir");
		ExcelUtils excel=new ExcelUtils(projectpath+"\\Excel\\AssignData.xlsx","Sheet1");
		excel.getrowcount();
		excel.getcolcount();
		excel.getcelldatanum(1, 0);
		excel.getcelldatastring(1, 1);
		

	}

}

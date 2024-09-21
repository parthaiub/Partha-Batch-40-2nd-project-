package exam;

/*
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import io.cucumber.messages.internal.com.google.common.collect.Table.Cell;

public class ExceFile {
	
	FileInputStream fis;
	
	HSSFWorkbook WB;
	public void GetEXcelfile(int rowIndex , int columnIndex) {
		
		
		//Find excel file path
		File file =new File("Exam-Home/src/main/resources/For Automation.xlsx");

		
		// Convert Data to workbook use FileInputStrem Class
		try {
			fis= new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		
		// Create Workbook object 
			try {
				WB= new HSSFWorkbook(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			HSSFSheet sht = WB.getSheetAt(0);// Call by index number
			
			//HSSFSheet sht = WB.getSheet("Partha");// By the particular sheet name
			
			
			// Find all the row 
		
			
		int totalRow =sht.getPhysicalNumberOfRows();
		// Loop all rows
		for(int i=0;i<totalRow;i++) {
			if(i==rowIndex) {
				
				HSSFRow row=sht.getRow(i);
				
				//Total Number of columns
				row.getLastCellNum();
				
				for(int j=0;j<totalRow;j++ ) {
					if(j==columnIndex) {
						HSSFCell cell =row.getCell(j);
						System.out.println(cell.getBooleanCellValue());
					}
		
				}
			}
		}
		
			

		
	}
	public static void main (String [] args) {
		ExceFile obj = new ExceFile();
		obj.GetEXcelfile(2, 5);

	}
}
*/

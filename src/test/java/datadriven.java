import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class datadriven {

	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("C:\\Users\\USER\\Documents\\Datadriven.xlsx");
//		Workbook workbook=new XSSFWorkbook(fs);
//		Sheet sheet=workbook.getSheet("Sheet1");
//		Row row=sheet.getRow(0);
//		Cell cell=row.getCell(1);
//		XSSFWorkbook workbook=new XSSFWorkbook(fs);
//		int sheets=workbook.getNumberOfSheets();
//		for(int i=0;i<sheets;i++) {
//			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
//				XSSFSheet sheet=workbook.getSheetAt(i);
//				Iterator<Row> rows=sheet.rowIterator();
//				Row row=rows.next();
//				Iterator<Cell> ce=row.cellIterator();
//				int k=0;int column=0;
//				while(ce.hasNext()) {
//					Cell value=ce.next();
//					if(value.getStringCellValue().equalsIgnoreCase("Testcases")) {
//						column=k;
//					}
//					k++;
//				}
//				System.out.println(column);
//			}
//
//		}
		
	}

}

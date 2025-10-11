import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	public static void main(String[] args) throws IOException {
		//FileInputStream fs=new FileInputStream("C:\\Users\\USER\\Documents\\Datadriven.xlsx");
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
		FileInputStream fis=new FileInputStream("C:\\Users\\USER\\Documents\\Datadriven.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> rows=sheet.iterator();
				Row row=rows.next();
				Iterator<Cell> cell=row.cellIterator();
				int k=0;int column=0;
				while(cell.hasNext()) {
					Cell ce=cell.next();
					if(ce.getStringCellValue().equals("data2")) {
						column=k;
					}
					k++;
				}
				while(rows.hasNext()) {
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("purchase")) {
						Iterator<Cell> cv=r.cellIterator();
						while(cv.hasNext()) {
						System.out.println(	cv.next().getStringCellValue());
						}
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

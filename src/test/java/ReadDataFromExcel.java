import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadDataFromExcel {
	public static ArrayList getData(String testCaseName) throws IOException {
		ArrayList<String> a=new ArrayList<String>();
		FileInputStream fis=new FileInputStream("C:\\Users\\USER\\Documents\\Datadriven.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> rows=sheet.rowIterator();
				Row row=rows.next();
				Iterator<Cell> cell=row.cellIterator();
				int k=0;int column=0;
				while(cell.hasNext()) {
					if(cell.next().getStringCellValue().equalsIgnoreCase("testcases")) {
						column=k;
					}
					k++;
				}
				while(rows.hasNext()) {
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						Iterator<Cell> cv=r.cellIterator();
						while(cv.hasNext()) {
							Cell c=cv.next();
							if(c.getCellType()==CellType.STRING) {
								a.add(c.getStringCellValue());								
							}
							else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								//a.add(cv.next().getNumericCellValue());
							}
						}
					}
				}
			}
		}
		return a;
	}
	public static void main(String[] args) throws IOException {
		ArrayList result=getData("add profile");
		System.out.println(result.get(0));
		System.out.println(result.get(1));
		System.out.println(result.get(2));
		System.out.println(result.get(3));
	}
}

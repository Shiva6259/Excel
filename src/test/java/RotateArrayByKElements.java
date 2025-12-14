import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RotateArrayByKElements {

	public static void main(String[] args) throws IOException {
//		FileInputStream fis=new FileInputStream("C:\\Users\\USER\\Documents\\Datadriven.xlsx");
//		XSSFWorkbook workbook=new XSSFWorkbook(fis);
//		int sheets=workbook.getNumberOfSheets();
//		for(int i=0;i<sheets;i++) {
//			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")){
//				XSSFSheet sheet=workbook.getSheetAt(i);
//				Iterator<Row> rows=sheet.iterator();
//				Row firstRow=rows.next();
//				while(rows.hasNext()) {
//					rows.next();
//				}
//			}
//		}
	    int[] arr= {1,2,3,4,5,6,7};int k=2;
	    System.out.print(rotateArray(arr,k));
//		String input="aavvbbeee";
//		String result="";
//		int count=1;
//		for(int i=0;i<input.length()-1;i++) {
//			if(input.charAt(i)==input.charAt(i+1)) {
//				count++;
//			}else {
//				result=result+input.charAt(i)+count;
//				count=1;
//			}
//		}
//		result=result+input.charAt(input.length()-1)+count;
//		System.out.println(result);
	}
	public static int[] rotateArray(int[] num,int k){
        int n=num.length;
        reverse(num,0,n-1);
        reverse(num,0,k-1);
        reverse(num,k,n-1);
        return num;
    }
    public static void reverse(int[] num,int start1,int end1){
       int start=0;
       int end=num.length-1;
       for(int i=0;i<num.length/2;i++){
           int temp=num[start];
           num[start]=num[end];
           num[end]=temp;
           start++;
           end--;
       }
    }
}

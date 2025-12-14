import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {
public static void main(String[] args) {
int[] arr= {2,3,4,0,0};
int count=0;
//for(int i=0;i<arr.length;i++) {
//	if(arr[i]!=0) {
//		arr[count]=arr[i];
//		count++;
//	}
//}
//while(count<arr.length) {
//	arr[count]=0;
//	count++;
//}
//System.out.print(Arrays.toString(arr));
List<Integer> list=new ArrayList<Integer>();
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=0) {
		list.add(arr[i]);
	}else {
		count++;
	}
}
for(int i=0;i<count;i++) {
	arr[i]=0;
}
int k=0;
for(int i=count;i<arr.length;i++) {
	arr[i]=list.get(k);
	k++;
}
System.out.println(Arrays.toString(arr));
}
}

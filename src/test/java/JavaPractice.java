import java.util.Arrays;
import java.util.Comparator;

public class JavaPractice {
	public static String findLongestString(String[] arr) {
		if(arr==null || arr.length==0) {
			return null;
		}
		String longestString=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i].length()>longestString.length() && arr[i]!=null) {
				longestString=arr[i];
			}
		}
		return longestString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int arr[]= {25,16,38,10,35,48,20,50}; Integer
		 * second=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).
		 * findFirst().get(); System.out.println(second);
		 */
		String[] fruits= {"apple","banana","cramberrry","pineapple","pomegranate","blueberry"};
//		System.out.println(findLongestString(fruits));
		int num=5;
		System.out.println(sum(12456));
	}
public static int sum(int num) {
	int rem=0;int sum=0;
	while(num>0) {
		rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	return sum;
}
}

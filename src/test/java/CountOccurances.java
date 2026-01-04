
public class CountOccurances {
public static void main(String[] args) {
	String input="aavvccddd";
	int count=1;String result="";
	for(int i=0;i<input.length()-1;i++) {
		if(input.charAt(i)==input.charAt(i+1)) {
			count++;
		}else {
			result=result+input.charAt(i)+count;
			count=1;
		}
	}
	result=result+input.charAt(input.length()-1)+count;
	System.out.println(result);
}
}

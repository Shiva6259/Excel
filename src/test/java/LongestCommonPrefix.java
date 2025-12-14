import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
	String[] s= {"flight","flower","flow"};
	Arrays.sort(s);
	String first=s[0];
	String last=s[s.length-1];
	int index=0;
	while(index<first.length()) {
		if(first.charAt(index)==last.charAt(index)) {
			index++;
		}else {
			break;
		}
	}
	System.out.println(index==0?"":first.substring(0,index));
	}

}

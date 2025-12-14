
public class LengthOfLastWord {
public static void main(String[] args) {
	String input=" sun rises on  the  east ";
	String s=input.trim();int count=0;
	for(int i=s.length()-1;i>=0;i--) {
		if(s.charAt(i)!=' ') {
			count++;
		}else {
			break;
		}
	}
	System.out.println("Length of last word is:"+count);
}
}

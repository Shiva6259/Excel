
public class StringNumericToStrings {
public static void main(String[] args) {
	String input="a2b3c4";
	for(int i=0;i<input.length();i++) {
		if(Character.isAlphabetic(input.charAt(i))) {
			System.out.print(input.charAt(i));
		}else {
			int x=Character.getNumericValue(input.charAt(i));
			for(int j=1;j<x;j++) {
				System.out.print(input.charAt(i-1));
			}
		}
	}
}
}

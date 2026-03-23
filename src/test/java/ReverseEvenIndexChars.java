
public class ReverseEvenIndexChars {

	public static void main(String[] args) {
	String input="shiva";
	System.out.println(reverseEvenIndexChars(input));
//	char[] after=input.toCharArray();
//	StringBuilder even=new StringBuilder();
//	for(int i=0;i<after.length;i++) {
//		if(after[i]%2==0) {
//			even.append(after[i]);
//		}
//	}
//	even.reverse();
//	int reverse=0;
//	for(int i=0;i<after.length;i+=2) {
//		after[i]=even.charAt(reverse);
//		reverse++;
//	}
//	System.out.println(after.toString());
	}
	public static String reverseEvenIndexChars(String s) {
        // Convert the string to a character array for mutability
        char[] chars = s.toCharArray();
        
        // Collect characters at even indices
        StringBuilder evenChars = new StringBuilder();
        for (int i = 0; i < chars.length; i += 2) {
            evenChars.append(chars[i]);
        }
        
        // Reverse the collected even index characters
        evenChars.reverse();
        
        // Replace the original even index characters with the reversed ones
        int reverseIndex = 0;
        for (int i = 0; i < chars.length; i += 2) {
            chars[i] = evenChars.charAt(reverseIndex++);
        }
        
        // Convert the modified character array back to a string
        return new String(chars);
    }	
}

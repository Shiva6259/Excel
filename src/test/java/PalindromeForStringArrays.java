
public class PalindromeForStringArrays {
public static void main(String[] args) {
	System.out.println("Palindrome strings are:");
	String[] arr = {"abc", "car", "ada", "racecar", "cool", "madam", "Level"};
	for(String a:arr) {
		if(isPalindrome(a)) {
			System.out.println(a);
		}
	}
}
public static boolean isPalindrome(String input) {
	String cleanStr=input.toLowerCase();
	int left=0;int right=cleanStr.length()-1;
	while(left<=right) {
		if(cleanStr.charAt(left)!=cleanStr.charAt(right)) {
			return false;
		}
		left++;
		right--;
	}
	return true;
}
}

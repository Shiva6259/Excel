
public class ValidParanthesis {

	public static void main(String[] args) {
		System.out.println(isParanthesis("{}"));

	}
	public static boolean isParanthesis(String input) {
		int balance=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='('||ch=='{'||ch=='[') {
				balance++;
			}else if(ch==')'||ch=='}'||ch==']') {
				balance--;
			}
			if(balance<0) {
				return false;
			}
		}
		return balance==0;
	}
}

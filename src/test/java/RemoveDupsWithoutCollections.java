
public class RemoveDupsWithoutCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String input="programming";
			String res="";
			for(int i=0;i<input.length();i++) {
				if(!res.contains(String.valueOf(input.charAt(i)))) {
					res=res+input.charAt(i);
				}
			}
			System.out.println(res);
	}

}

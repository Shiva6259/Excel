import java.util.HashMap;
import java.util.Map;
public class Practice {
	
	public static void main(String[] args) {
		String s1="bat";
		String s2="tab";
		if(isAnagram(s1,s2)) {
			System.out.println(s1+" and "+s2+" are Anagrams");
		}else {
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}
	public static boolean isAnagram(String s1,String s2) {
		Map<Character,Integer> map1=new HashMap<Character,Integer>();
		Map<Character,Integer> map2=new HashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(map1.get(ch)==null) {
				map1.put(ch,1);
			}else {
				map1.put(ch,map1.get(ch)+1);
			}
		}
		for(int i=0;i<s2.length();i++) {
			char ch=s2.charAt(i);
			if(map2.get(ch)==null) {
				map2.put(ch,1);
			}else {
				map2.put(ch,map2.get(ch)+1);
			}
		}
		return map1.equals(map2);
	}
}



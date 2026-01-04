import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutrepeatingchars {

	public static void main(String[] args) {
		String input="java";
		String longest=null;
		int count=0;
		Map<Character,Integer>map=new LinkedHashMap<>();
		char[] arr=input.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i];
			if(!map.containsKey(ch)) {
				map.put(ch,i);
			}else {
				i=map.get(ch);
				map.clear();
			}
			if(map.size()>count) {
				count=map.size();
				longest=map.keySet().toString();
			}
		}
		System.out.println(count+" "+longest);
	}

}

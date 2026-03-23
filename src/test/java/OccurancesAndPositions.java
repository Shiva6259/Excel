import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OccurancesAndPositions {
public static void main(String[] args) {
	String input="programming";
	Map<Character,List<Integer>> map=new LinkedHashMap<>();
	for(int i=0;i<input.length();i++) {
		char ch=input.charAt(i);
		if(!map.containsKey(ch)) {
			map.put(ch,new ArrayList<>());
		}
			map.get(ch).add(i);
		
	}
	for(Map.Entry<Character,List<Integer>> result:map.entrySet()){
		char ch=result.getKey();
		List<Integer> val=result.getValue();
		System.out.println(ch+" is appearing "+val.size()+" times at index"+val);
	}
}
}

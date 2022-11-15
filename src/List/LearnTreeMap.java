package List;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    
	public static void main(String[] args) {
		Map<String,Integer> num = new TreeMap<>();
		num.put("One",20);
		num.put("Two",54);
		num.put("Three",5);
		num.put("Four",25);
		
		num.remove("Three");
		
	//	num.put("two",30);  // update the value if key is same
		System.out.println(num);
		
	//	num.putIfAbsent("two",23);
	//	System.out.println(num);

	for(Map.Entry<String,Integer> e : num.entrySet()) {
		System.out.println(e);
		System.out.println(e.getKey());
		System.out.println(e.getValue());
	}
	
	for(String key : num.keySet()) {
		System.out.println(key);
	}
	
	for(Integer value : num.values()) {
		System.out.println(value);
	}
	}
}

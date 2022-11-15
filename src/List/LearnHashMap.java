package List;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    
	public static void main(String[] args) {
		Map<String,Integer> num = new HashMap<>();
		num.put("One",20);
		num.put("two",54);
		num.put("three",5);
		num.put("four",25);
		
	//	num.put("two",30);  // update the value if key is same
		System.out.println(num);
		num.remove("One");
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

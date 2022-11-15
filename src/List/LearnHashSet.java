package List;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
	public static void main(String[] args) {
		 Set<Integer> set = new HashSet<>();
		 set.add(5);
		 set.add(8);
		 set.add(0);
		 set.add(20);
		 set.add(10);
		 set.add(1);
		 System.out.println(set);
		 
		 set.remove(20);
		 System.out.println(set);
		 System.out.println(set.contains(8));
	}

}

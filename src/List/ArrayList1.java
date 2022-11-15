package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		System.out.println("khvjvk");

		ArrayList<Float> list = new ArrayList<>();
		list.add(3.7F);
		list.add(1.6F);
		list.set(1, 2.6F);  // update the value based on index
	    list.add(5.4F);
	    for (int i=0; i<list.size(); i++) {
	    	System.out.println("element is "+ list.get(i));
	    }
	    
	    for (Float element : list) {
	    	System.out.println("Arraylist is :"+ element);
	    }
	    
	    Iterator<Float> it = list.iterator();
	    while(it.hasNext()) {
	    	System.out.println("iterator value :" + it.next());
	    }
	    
	    
//		List<String> newlist = new ArrayList<String>(); // we also add new list into old list
//        newlist.add("kamboj");
//        newlist.add("deep");
//        list.addAll(newlist);
//        System.out.println(list);
       
//        list.remove(3.7F);
//        System.out.println(list);
//        System.out.println(list.contains(2.6F));
	}
}
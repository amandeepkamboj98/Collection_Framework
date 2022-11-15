package List;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedList {
	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<>();
		 que.offer(10); //  add element
		 que.offer(67);
		 que.offer(65);
		 que.offer(45);
		 que.offer(20);
		 System.out.println(que);
	
		 que.poll(); // remove element
		System.out.println(que); 
		System.out.println(que.peek()); // next element ready to remove 
		que.poll(); // remove element
		System.out.println(que); 
		System.out.println(que.peek()); 
		  
	
	}
}

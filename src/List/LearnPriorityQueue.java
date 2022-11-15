package List;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
	public static void main(String[] args) {
		
	
	PriorityQueue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());
	que.offer(10);
	que.offer(6);
	que.offer(60);
	que.offer(40);

	System.out.println(que);
	
	que.poll();
	System.out.println(que);

	que.poll();
	System.out.println(que);
System.out.println(que.peek());
	}
}

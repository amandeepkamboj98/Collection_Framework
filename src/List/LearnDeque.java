package List;

import java.util.ArrayDeque;

public class LearnDeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(50);
		adq.offer(5);
		adq.offerFirst(20);
		adq.offerLast(25);
		adq.offerFirst(22);
		adq.offerLast(5);
		System.out.println(adq);
		System.out.println(adq.size());
		System.out.println(adq.poll());
		System.out.println(adq);
		adq.pollFirst();
		System.out.println(adq);
		adq.pollLast();
		System.out.println(adq);
		System.out.println(adq.size());
		System.out.println(adq.peek());
		
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
	}

}

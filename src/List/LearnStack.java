package List;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {

		Stack<String> animals = new Stack<>();
		animals.push("kutta");
		animals.push("billi");
		animals.push("sher");
		animals.push("hathi");

		System.out.println("stack is :" + animals); 
		System.out.println(animals.peek());  // show upper element in stack
		
		animals.pop();  //  remove the element
		System.out.println(animals.peek());  
	}
}

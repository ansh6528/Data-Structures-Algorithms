package dataStructures;

import java.util.Stack;

public class Stacks {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("Ansh");
		stack.push("Akshat");
		stack.push("Tuffy");
		
		stack.empty();
		stack.isEmpty();
		
		System.out.println(stack);
		System.out.println("First element of the stack -> " + stack.peek());
		System.out.println("Element removed from stack -> " + stack.pop());
		System.out.println("Stack after removal of element -> " + stack);
	}
}

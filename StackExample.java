package dynamicprogram;

import java.util.Stack;
import java.util.Queue;

public class StackExample {
	public static void main(String arg[]) {
		Stack<Character> stack = new Stack();
		
		stack.add('1');
		stack.add('2');
		stack.add('3');
		stack.add('4');
		stack.add('5');
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
	}
	
}

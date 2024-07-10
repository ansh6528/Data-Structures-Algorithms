import java.util.Stack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> newStack = new Stack<>();
		Stack<Integer> stack = new Stack<>();
		int sizeOfStack = 12;
		
		stack.push(12);
		stack.push(6);
		stack.push(8);
		stack.push(9);
		stack.push(9);
		stack.push(5);
		stack.push(11);
		stack.push(5);
		stack.push(5);
		stack.push(9);
		stack.push(6);
		stack.push(11);
		
		System.out.println(stack);
		
		Double middle = Math.floor((sizeOfStack+1)/2) - 1;
        if(sizeOfStack%2 == 0) {
            //middle = Math.floor((sizeOfStack)/2) - 1;
            int counter = 1;
        } else {
            //middle = Math.floor((sizeOfStack+1)/2) - 1;
            int counter = 0;
        }
        //Double middle = Math.floor((sizeOfStack+1)/2) - 1;
        Integer middleElement = middle.intValue();
        int val = stack.get(middleElement);
        int counter = 0;
        
        while(!stack.empty() && stack.size() > middleElement) {
            if(counter == middleElement) {
            	stack.pop();
            }
            counter++;
            newStack.push(stack.pop());
        }
        
        while(!newStack.empty()) {
            stack.push(newStack.pop());
        }
	}

}

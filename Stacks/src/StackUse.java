
public class StackUse {

	public static void main(String[] args) throws StackFullException{
		stackusingArray stack = new stackusingArray(2);
		
		for(int i = 1; i <=6; i++) {
		stack.push(i);	
		
		}
		
		while(!stack.isEmpty()) {
			//			stack.pop();
			System.out.println(stack.pop());
		
	}
	}
}
	



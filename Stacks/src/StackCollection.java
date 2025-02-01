import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
//		int arr[] = {5,5,6,8};
			for(int i = 0; i < 10; i++) {
				stack.push(i*2);
			}
//			while(!stack.isEmpty()) {
				System.out.println(stack.peek());
				stack.pop();
					
				}
			}
		
	
//Stack<Integer> stack=new Stack<Integer>();
//stack.push(5);
//stack.push(10);
//stack.push(15);
//System.out.print(stack.pop()+stack.size());
//}
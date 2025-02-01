
public class stackusingArray {

//	public static void main(String[] args) {
	
	
	private int data[];
	private int top; // is the  index of topmost element of stack
	
	public stackusingArray() {
		data = new int[10];
		top = -1;
		
	}
	public stackusingArray(int capacity) {
		data = new int[capacity];
		top = -1;
		
		
	}
	
	public boolean isEmpty() {
//		if(top == -1) {
//			return true;
//		}else {
//			return false;
//		}
		return (top == -1);
	}
	
		public int size() {
			return top +1;
		}
	
		public int top() {
			if(size() == 0) {
				//stackEmptyException
				StackEmptyException e = new StackEmptyException();
//				throw e;
			}
			return data[top];
		}
		
		public void push(int elem) {
			if(size()== data.length) {
				//stack full
//				StackEmptyException e = new StackEmptyException();
//				throw e;
				doubleCapacity();
			}
			top++;
			data[top] = elem;
			
		}
		//FOR INCREASEIING THE LENGTH OF STACKS
		private void doubleCapacity() {
			int temp[]= data;
			data = new int[2 * temp.length];
			for(int i = 0; i<= top; i++) {
				data[i] = temp[i];
		}
			
			
		}	
		public int pop() {
			
			int temp = data[top];
			top--;
			return temp;
		}
		
	}

	




public class StackUsingLL<T> {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private Node<T> head;
		private int size;
		
		public StackUsingLL() {
			head = null;
			size = 0;
			
		}
	
public	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size() == 0;
}
	
	
	
	
	T top() throws StackEmptyException {
		if(size()== 0) {
			throw new StackEmptyException();		}
	
		return head.data;
	}


 public void push(T element) {
	 
Node<T> newNode = new Node<T>(element); 
 newNode.next = head;
 head = newNode;
 size++;
 }
 
 
  T pop() throws StackEmptyException{
	  if(size()== 0) {
			throw new StackEmptyException();		}
	
	T tempdata = head.data;  
  head = head.next;
  size--;
  return tempdata;
  
  
  
  }
}
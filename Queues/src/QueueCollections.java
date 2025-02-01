import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Queue<Integer> queue = new LinkedList<Integer>();
//   Queue<Integer> queue =new LinkedList<Integer>();
   Stack<Integer> stack=new Stack<Integer>();
   queue.add(5);
   queue.add(10);
   stack.push(10);
   stack.push(20);
   System.out.print(queue.peek()+stack.pop());
}

}

import java.util.ArrayList;

public class TreeNode<T> {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

	public	T data;
	public	ArrayList<TreeNode<T>> children;
	
	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<>();
	}
		
	}


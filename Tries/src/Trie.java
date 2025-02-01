
class TrieNode{
	
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;
	
	// CONSTRUCTOR
	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
	// Above line is Trie node str...
}

public class Trie {
	
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0'); //null
	}
	
	  // make search function
	public boolean search(String word) {
		return search(root, word);
	}
	
	private boolean search(TrieNode root, String word) {
		
		if(word.length()==0) {
			return root.isTerminating;
		}
			
		int childIndex = word.charAt(0)-'a';
		TrieNode child = root.children[childIndex]; //TO get child in root
		if(child == null) {
			return false;
	}
		return search(child, word.substring(1));
	}
	
	// Remove Worxd from TRIES
	
	public void remove( String word) {
		remove (root, word);
		
	}
	
	
private void remove(TrieNode root, String word) {
	
	if(word.length()== 0) {
		root.isTerminating = false;
		return;
	}
	
	int childIndex = word.charAt(0)- 'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return ;
		}
	remove (child , word.substring(1));
	//we can remove child node only if it is non terminating and its number of children is 0
	
	if(!child.isTerminating && child.childCount == 0) {
		root.children[childIndex] = null;
		child = null ;
		root.childCount--;
	}
	
//	if(!child.isTerminating) {
//		int numChild = 0;
//		for ( int i = 0; i < 26; i++) {
//			if(child.children[i] != null) {
//				numChild++;
//			}
//		}
//		if(numChild == 0) {
//			// we can delete child
//			root.children[childIndex] = null;
//			child = null;  // IN java garbage collector for delete 
//			root.childCount--;
//		}
//		
//	}
	}

//	make add function
	public void add(TrieNode root, String word) {
		
		if(word.length()== 0) {
			root.isTerminating = true;
			return;
		}
		
		int childIndex = word.charAt(0)-'a';
		TrieNode child = root.children[childIndex]; //TO get child in root
		if(child == null) {
			child = new TrieNode(word.charAt(0)); //  if node is empty then make a NEW NODE 
			root.children[childIndex] = child;
			root.childCount++;
	}
		// recursion call
				add(child, word.substring(1));
	}

	public void add(String word) {
		add(root, word);
		
		
		}
		
		
		
}

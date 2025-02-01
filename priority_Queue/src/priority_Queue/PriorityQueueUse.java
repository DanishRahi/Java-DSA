package priority_Queue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueUse {
	
	

//	public static void main(String[] args) throws PriorityQueueException {
		// TODO Auto-generated method stub
		
//		Priority_Queue pq = new Priority_Queue();
//		int arr[] = {5,1,9,2,0};
//		for(int i = 0; i < arr.length; i++) {
//			pq.insert(arr[i]);
//			
//		}
//		
//		while(! pq.isEmpty()) {
//			System.out.println(pq.removeMin() + " ");
//			
//		}
//		System.out.println();
//	}

//}
	           // K-Sorted Array program 
//	public static void sortKSorted(int arr[], int k) {
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		int i = 0;
//		for(; i<k; i++) {
//			pq.add(arr[i]);
//		}
//		
//		for	(; i<arr.length; i++) {
//			arr[i -k] =pq.remove();
//			pq.add(arr[i]);
//			}
//	
//	
//	for(int j = arr.length - k; j< arr.length; j++) {
//		arr[j] =  pq.remove();
//		
//	}
//	}
	
	
	           // K - largest Element
//	public static void printKLargest(int arr[], int k) {
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		int i = 0;
//		for(; i < k; i++) {
//		pq.add(arr[i]);
//		
//		}
//		
//		for (; i < arr.length; i++) {
//			int min = pq.element();
//			if(min > arr[i] ){
//				pq.remove();
//				pq.add(arr[i]);
//			}
//			
//		}
//		while (! pq.isEmpty()) {
//			System.out.println(pq.remove());
//		}
//		
//		
//	}
////	
//	public static void main(String[] args) {
//		int arr[] = {28,15,8,9,12,20};
//		printKLargest(arr, 3);
//		
//	}
	
	
	
//	public static void main(String[]args) {
//
//		
//		
//		int arr[]= {2,4,1,9,6,8};
//		int k = 3;
//		sortKSorted(arr, k);
//		for (int i = 0; i< arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
//	}
	
}







//public static ArrayList<Integer> kLargest(int input[], int k) {
//
//
//PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//for(int i=0;i<k;i++)
//{
//    pq.add(input[i]);
//}
//
//for(int i=k;i<input.length;i++)
//{
//    int minVal=pq.peek();
//    if(minVal<input[i])
//        minVal=input[i];
//    if(minVal!=pq.peek())
//    {
//        pq.poll();
//        pq.add(minVal);
//    }
//}
//
//ArrayList<Integer> arr = new ArrayList<Integer>();
//while(!pq.isEmpty())
//    arr.add(pq.poll());
//return arr;
//
//}
//}


               // implace Heap Sort



public class Solution {

	public static boolean checkMaxHeap(int arr[]) {
		
        return checkMaxHeapHelper(arr,0);
	}
    
    private static boolean checkMaxHeapHelper(int[] arr, int startIndex)
    {
        //Base case - if the current parent node index (startIndex) is greater than array size,
        //then, we have successfully reached the end of the heap nd at each level the max heap property is satisfied
        //Hence, we return true
        if(startIndex==arr.length)
            return true;
        
        //Calculate the current indices of the parent and its children
        int parentIndex=startIndex;
        int leftChildIndex=2*parentIndex+1,rightChildIndex=2*parentIndex+2;
        
        //Assume that the max heap property is satisfied for both children of the current parent
        boolean leftAns=true,rightAns=true;
        
        //If index of left child > array size, then the left child does not exist. Hence, we retain the leftAns=true
        //If the condition is satisfied, we check if the parent<left child. If it is true, we return false as 
        //max heap property is violated. Else, we continue with the checks by making the left child the new parent
        if(leftChildIndex<arr.length)
        {
            if(arr[parentIndex]<arr[leftChildIndex])
                return false;
            else
                leftAns=checkMaxHeapHelper(arr,leftChildIndex);
        }
        
        //The if-condition for the right child follows same logic as of the left child
        if(rightChildIndex<arr.length)
        {
            if(arr[parentIndex]<arr[rightChildIndex])
                return false;
            else
                rightAns=checkMaxHeapHelper(arr,rightChildIndex);
        }
        
        //If current parent satisfies the max heap property, then the results for its left and/or right child are 
        //used to determine if the property is maintained.
        return (leftAns && rightAns);
            
    }
}
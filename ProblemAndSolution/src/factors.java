

 import java.util.*;
public class factors {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int count = 0;
        for (int i=2;i<n;i++)
        {
            if (n%i==0)
            {
                System.out.print(i+" ");
                count++;
            }
        }
        if(count == 0) {
        	System.out.println(-1);
        }
        
    }
}
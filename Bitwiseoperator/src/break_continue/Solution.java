package break_continue;

import java.util.Scanner;

public class Solution {
	


public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=2 ;i<=n;i++)
    {
        int count=0;
        for(int j=2;j<=i;j++)
        {
            if(i%j==0)
            count++;
        }
        if(count==1) 
            System.out.println(i);
    }
    
    if(n >= 2) {
    	System.out.println(2);
    }
    for(int i= 3; i <=n; i+=2) {
    	if(isPrime(i)) {
    		System.out.println(i);
    	}
    }
    }


     public static boolean isPrime(int num) {
	int sqrtNum = (int) Math.sqrt(num);
	for(int i = 3; i <= sqrtNum; i+=2) {
		if(num%i == 0) {
			return false;
		}
	}
	return true;


}
}



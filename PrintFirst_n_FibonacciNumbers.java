import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
public class PrintFirst_n_FibonacciNumbers{
    public static long[] printFibb(int n) {
        if (n <= 0) {
            return new long[0]; // Return an empty array for n <= 0.
        }
        
        long[] ans = new long[n];
        ans[0] = 1;

        if (n > 1) {
            ans[1] = 1;

            for (int i = 2; i < n; i++) {
                ans[i] = ans[i - 1] + ans[i - 2];
            }
        }

        return ans;
    }
}










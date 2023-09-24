import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Find_first_set_bit ob=new Find_first_set_bit();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}
public class Find_first_set_bit {
    public static int getFirstSetBit(int n){
        int count=0;
        if(n==0){
            return 0;
        }
            while(n>0){
                count+=1;
                if(n%2==1){
                    return count;
                }
                else {
                    n=n/2;
                }
            }
          return 0;  
    }
}

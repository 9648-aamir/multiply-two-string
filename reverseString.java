import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new reverseString().reverseWord(str));
        }
    }
}
class reverseString
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        StringBuffer str1=new StringBuffer(str);
        str1.reverse();
        return str1.toString();
    }
}
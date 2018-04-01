package abhishek;
import java.util.*;
public class ReverseString 
{
	public static void main(String args[])
	{
		//String reverse = "";
		
		/*System.out.println(s);
		System.out.println(s.length());
		
		int i=0;
		for(i=s.length()-1; i>=0 ; i--)
		{
		   reverse = reverse + s.charAt(i);
		}
		System.out.println("reverse string is :" +reverse);*/
		
		
		String s = "abhishek";
		char c[] = s.toCharArray();
		int i;
		for(i=c.length-1; i>=0 ; i--){
			System.out.println(c[i]);
		}
        	System.out.println("space..............:");
        	
		  String s1 = "tutorialspoint";
	      char c1[] = s1.toCharArray();
	      int j;
	      for (j = c1.length-1; j>=0 ;j--) {
	        System.out.println(c1[j]);
	     }
	}
}
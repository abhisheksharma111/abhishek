package abhishek;
import java.util.*;
public class ReverseString 
{
	public static void main(String args[])
	{
		String s = "abhishek";
		String reverse = " ";
		
		System.out.println(s);
		System.out.println(s.length());
		
		int i=0;
		for(i=s.length()-1; i>=0 ; i--)
		{
		   reverse = reverse + s.charAt(i);
		}
		System.out.println("reverse string is :" +reverse);
	}
}
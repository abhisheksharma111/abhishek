package abhishek;
import java.util.*;

public class NewTest 
{
	public static void main(String[] args) 
	{
	  int a = 00032200000022;
	  int b = 000022000011;
	  int c = 0001110000015;
	  
	  String s = Integer.toString(a);
	  System.out.println(s);
	  char[] ch = s.toCharArray();
	  //System.out.println(ch);
	  
	  int i;
	  for(i=0; i<ch.length-1 ;i++)
	  {
		  System.out.println(ch[i]);
	  }
}
} 
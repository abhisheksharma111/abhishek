package abhishek;
import java.util.*;

public class TrimToSizeExample 
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>(10);
		al.add("abhi");
		al.add("ravi");
		al.add("sunny");
		al.add("monu");
		al.add("sonu");
		al.add("sharma");
		al.add("verma");
		al.trimToSize();
		System.out.println("array list :" +al);
	}
} 
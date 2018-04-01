package abhishek;

public class StringRecursiveReversalExample {
	String reverse = " ";
	public String reverseString(String str)
	{
		if(str.length()==1)
		{
			System.out.println("Str value : " +str);
			return reverse = str;
		}
		else
		{
			reverse = reverse + str.charAt(str.length()-1)+	reverseString(str.substring(0,str.length()-1));
			System.out.println("Substring value : " +str.length());
			System.out.println("reverseValue : " +reverse);
			return reverse;
			
		}
	}  
	public static void main(String args[])
	{
		StringRecursiveReversalExample srre = new StringRecursiveReversalExample();
		System.out.println(" recursive Result :"+srre.reverseString("abcd"));
	}

}

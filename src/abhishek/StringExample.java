package abhishek;

public class StringExample 
   {
	 public static void main(String args[])
	 {
		 String s1 = "   spring   summer   ";
	/*	 String s1 = removeCharAt(s,4);
		 System.out.println(s1);
	 }

	private static String removeCharAt(String s, int i) {
		return null;      */
		 
		/* String s2 = s1 + "summer";
		 s1.concat("fall");
		 s2.concat(s1);
		 s1 += "winter";
		 System.out.println(s1 + " " +s2); */
		 System.out.println(s1);
		 //System.out.println(s1.trim());
		 System.out.println(s1.replaceAll("\\s" , ""));
		 
	}
}
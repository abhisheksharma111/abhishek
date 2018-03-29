package abhishek;
import java.util.*; 

	enum days 
	{
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	}
	public class EnumExample
	{
	public static void main(String args[])
	{
		Set<days> s = EnumSet.of(days.Monday, days.Tuesday);
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
		
		Set<days> s1 = EnumSet.allOf(days.class);
		Iterator itr1 = s1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		Set<days> s2 = EnumSet.noneOf(days.class);
		Iterator itr2 = s2.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}
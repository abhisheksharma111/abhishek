package abhishek;
import java.util.*;

public class PriorityQueueExample 
{
	public static void main(String args[])
	{
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("abhi");
		pq.add("abhishek");
		pq.add("kumar");
		pq.add("sharma");
		System.out.println(pq.element());
		System.out.println(pq.peek());
		System.out.println("iterating the element :");
		Iterator itr1 = pq.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		pq.remove();
		pq.poll();
		System.out.println("after removing the element :");
		Iterator itr2 = pq.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}

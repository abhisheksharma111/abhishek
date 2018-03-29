package abhishek;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {
	public static void main(String args[])
	{
	LinkedList<Integer> list=new LinkedList<Integer>();
	list.add(1);
	list.add(2);
    list.add(5);
    list.add(4);
    list.add(3);
    Collections.reverse(list);
    Iterator<Integer> itr=list.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
    
}
}
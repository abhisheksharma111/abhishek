package abhishek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {


	public static void main(String args[])
	{
	ArrayList<String> list=new ArrayList<String>();
	list.add("1");
	list.add("2");
    list.add("5");
    list.add("4");
    list.add("3");
    list.add("2");

    int firstIndex = list.indexOf("2");
    System.out.println("first index :" +firstIndex);
    
    int lastIndex = list.lastIndexOf("2");
    System.out.println("first index :" +lastIndex);
    
    
    Iterator<String> itr=list.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
    if(list!=null && !list.isEmpty())
    {
    	System.out.println("last element is :" + list.get(list.size()-1));
    }
    
}

}

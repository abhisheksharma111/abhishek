
package abhishek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample
{
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
    System.out.println("first index of 2:" +firstIndex);
    
    int lastIndex = list.lastIndexOf("2");
    System.out.println("last index of 2:" +lastIndex);
    
    System.out.println("iterating the element : ");
    Iterator<String> itr=list.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
    
    
    Collections.sort(list, Collections.reverseOrder());
    System.out.println("sorting or decending the arraylist :");
    Iterator<String> itr1=list.iterator();
    while(itr1.hasNext())
    {
    	System.out.println(itr1.next());
    }
    
    
    if(list!=null && !list.isEmpty())
    {
    	System.out.println("last element is :" + list.get(list.size()-1));
    }
    
}

}

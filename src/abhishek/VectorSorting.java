package abhishek;

import java.util.*;
public class VectorSorting 
{
 public static void main(String[] args) 
 {

    Vector<String> vector = new Vector<String>();
    vector.add("Walter");
    vector.add("Anna");
    vector.add("Hank");
    vector.add("Flynn");
    vector.add("Tom");
 
    System.out.println("Vector elements before sorting: ");
    /*for(int i=0; i < vector.size(); i++){
       System.out.println(vector.get(i));
    }*/
    Iterator itr=vector.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }

    Collections.sort(vector);

    Iterator itr1=vector.iterator();
    while(itr1.hasNext())
    {
    	System.out.println(itr1.next());
    }

 }
 } 
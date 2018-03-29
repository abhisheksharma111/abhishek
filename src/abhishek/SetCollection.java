package abhishek;

import java.util.*;  
class SetCollection
{  
 public static void main(String args[]){  
   
  HashSet<String> set=new HashSet<String>();  
  set.add("ajay");  
  set.add("vijay");  
  set.add("ravi");  
  //set.add("vijay"); 
   
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  
 }  
}  
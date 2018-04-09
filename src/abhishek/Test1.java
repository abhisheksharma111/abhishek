package abhishek;
import java.lang.reflect.*;
import java.lang.*;

class Test{}  

class Test1 {    
	  public void printName(Object obj)
	  {  
	  Class c=obj.getClass();    
	  System.out.println(c.getName());  
	  }  
	  public static void main(String args[]) throws Exception
	  {  
	   Test t=new Test();  
	   
	   Test1 t1=new Test1();  
	   t1.printName(t);  
	  }
	} 
package abhishek;
import java.io.*;

class Parent
 {  
  void msg() 
  {
	  System.out.println("parent");}  
 }  
  
class TestExceptionChild extends Parent
{  
  void msg() 
   {  
     System.out.println("TestExceptionChild");  
   }  
  public static void main(String args[])
  {  
	 // Parent p = new Parent();
	 // TestExceptionChild t = new TestExceptionChild();
	  Parent p1 = new TestExceptionChild();
      //p.msg(); 
      //t.msg();
	  try {
      p1.msg();
	  }
	  catch(Exception e)
	  {}
  }  
}  
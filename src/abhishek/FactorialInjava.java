package abhishek;

public class FactorialInjava {
	private static String number;
	public static void main(String args[])
	{
      int i1,fact1=1;
	  int number1=5; 
	  for(i1=1;i1<=number1;i1++)
	  {    
	      fact1=fact1*i1;    
	  }    
	  System.out.println("Factorial of "+number1+" is: "+fact1);
	  
	  int i2,fact2=1;  
	  int number2=4;   
	  fact2 = factorial(number2);   
	  System.out.println("Factorial of number using recursion "+number2+" is: "+fact2); 
	}
	static int factorial(int n)
	{    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }   
}
package abhishek;

public class FactorialInjava {
	public static void main(String args[])
	{
		System.out.println("factorial of 5 using recursion :" + factorial(5));
		System.out.println("factorial of 6 using iterator :" + factorial(6));
	}
	public static int factorial(int number)
	{
		if(number==0)
		{
			return 0;
		}
		return number*factorial(number-1);
	}
    public static int fact(int number)
    {
    	int result=1;
    	while(number!=0)
    	{
    		result=result*number;
    		number--;
    	}
    	return result;
    }
}

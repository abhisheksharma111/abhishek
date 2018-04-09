package abhishek;

public class CallByValue 
{
	int a=50;
	void change(int a)
	{
		a=a+10;
	}
	public static void main(String args[])
	{
		CallByValue c = new CallByValue();
		System.out.println("before change: " +c.a);
		c.change(100);
		System.out.println("after change :" +c.a);
	}
}
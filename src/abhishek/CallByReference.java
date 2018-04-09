package abhishek;

public class CallByReference 
{
	int a=50;
	void change(CallByReference c)
	{
		c.a = c.a + 100;
	}
	public static void main(String args[])
	{
		CallByReference c = new CallByReference();
		System.out.println("before change: " +c.a);
		c.change(c);
		System.out.println("after change :" +c.a);
	}
}
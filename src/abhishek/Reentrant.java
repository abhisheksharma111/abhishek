package abhishek;

public class Reentrant extends Thread
{
	synchronized void m()
	{
		n();
		System.out.println("this is m() method ");
	}
	synchronized void n()
	{
		System.out.println("this is n() method");
	}
}

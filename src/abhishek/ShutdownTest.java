package abhishek;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("shut down hook task");
	}
}

public class ShutdownTest 
{
	public static void main(String args[]) throws Exception
	{
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		System.out.println(" now main sleeping....press ctrl+c to exit ");
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

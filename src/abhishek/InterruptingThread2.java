package abhishek;

public class InterruptingThread2 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		InterruptingThread2 i = new InterruptingThread2();
		//InterruptingThread2 i1 = new InterruptingThread2();
		i.start();
		i.interrupt();
		
		//i1.start();
	}
}
package abhishek;

public class ReentrantExample extends Thread
{
	public static void main(String args[])
	{
		Reentrant r= new Reentrant();
		Thread t = new Thread()
				{
			      public void run()
			      {
			    	  r.m();
			      }
				};
		t.start();
	}
}

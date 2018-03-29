package abhishek;

class Table
{
/*	synchronized */ void printTable(int n) //for synchronized method
	{
	synchronized(this)
	{ // for synchronized block 
		for(int i=1; i<=5; i++)
		{
			System.out.println(n*i);
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
}}
class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t = t;
	}
	public void run() 
	{
		t.printTable(5);
	}
}

class MyThread2 extends Thread
{
	 Table t;
	MyThread2(Table t)
	{
		this.t = t;
	} 
	public void run() 
	{
		t.printTable(10);
	}
}
public class SynchronizationTest 
{
	public static void main(String ars[])
	{
		
       Table obj = new Table();
       MyThread1 m1 = new MyThread1(obj);
       MyThread2 m2 = new MyThread2(obj);
       m1.start();
       m2.start();
}
}
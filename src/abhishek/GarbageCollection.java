package abhishek;

public class GarbageCollection 
{
	public void finalize() 
	{
		System.out.println("object");
	}
	public static void main(String args[])
	{
		GarbageCollection g1 = new GarbageCollection();
		GarbageCollection g2 = new GarbageCollection();
		g1=null;
		g2=null;
		System.gc();
	}
}
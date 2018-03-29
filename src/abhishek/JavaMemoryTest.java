package abhishek;

public class JavaMemoryTest 
{
	public static void main(String args[])
	{
		Runtime r = Runtime.getRuntime();
		System.out.println("total memory :" + r.totalMemory());
		System.out.println("free memory :" + r.freeMemory());
	
	for(int i=0; i<=10000; i++)
	{
		new JavaMemoryTest();
	}
	System.out.println("after creating 10000 instance : " + r.freeMemory());
	System.gc();
	System.out.println("after garbage collection : " + r.freeMemory());
	}
}

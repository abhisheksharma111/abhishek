package abhishek;

public class JavaRuntime 
{
	public static void main(String args[])
	{
		try
		{
		    Runtime.getRuntime().exec("Notepad");
		    Runtime.getRuntime().availableProcessors();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

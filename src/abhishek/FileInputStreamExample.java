package abhishek;
import java.io.*;
public class FileInputStreamExample {
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\testout.txt");
			
			
			//int i=fis.read();
			//System.out.println((char)i);
			
			int i=0;    
            while((i=fis.read())!=-1){    
            System.out.print((char)i);
			
            }
			fis.close();
            
			System.out.println(" success ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
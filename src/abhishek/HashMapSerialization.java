package abhishek;

import java.util.*;
import java.io.*;

public class HashMapSerialization 
{
	public static void main(String args[])
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(4, "ab");
		hm.put(2, "abhi");
		hm.put(1, "abhishek");
		hm.put(5, "kumar");
		hm.put(3, "sharma");
		
		Object removedValue = hm.remove(1);
		System.out.println("after removing :" +hm);
		
		
		try
		{
			FileOutputStream fos = new FileOutputStream("Z:\\ file.txt");
			ObjectOutputStream o = new ObjectOutputStream(fos);
			o.writeObject(hm);
			o.close();
			fos.close();
			System.out.println("serialize object saved in file.txt file :");
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}	
	}
}

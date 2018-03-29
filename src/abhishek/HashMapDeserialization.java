package abhishek;

import java.io.*;
import java.util.*;
public class HashMapDeserialization
{
   public static void main(String [] args)
   {
      HashMap<Integer, String> map = null;
      try
      {
         FileInputStream fis = new FileInputStream("Z:\\ file.txt");
         ObjectInputStream ois = new ObjectInputStream(fis);
         map = (HashMap) ois.readObject();
         ois.close();
         fis.close();
      }
      catch(IOException ioe)
      {
         ioe.printStackTrace();
         return;
      }
      catch(ClassNotFoundException c)
      {
         System.out.println("Class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Deserialized HashMap..");
      
      Set set = map.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key: "+ mentry.getKey() + " & Value: ");
         System.out.println(mentry.getValue());
      }
    }
}
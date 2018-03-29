package abhishek;
import java.io.*;

public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("Z:\\testout.txt");    
            // fout.write(65);    
             //fout.close();    
             
             
             String s="Welcome to javaTpoint.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);
             
             
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
} 
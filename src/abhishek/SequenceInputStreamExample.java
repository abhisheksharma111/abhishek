package abhishek;

import java.io.*;  
class SequenceInputStreamExample {    
  public static void main(String args[])throws Exception{    
   FileInputStream input1=new FileInputStream("Z:\\testin.txt");    
   FileInputStream input2=new FileInputStream("Z:\\testout.txt");    
   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
   int j;    
   while((j=inst.read())!=-1){    
    System.out.print((char)j);    
   }    
   inst.close();    
   input1.close();    
   input2.close();    
  }    
} 
package abhishek;

import java.io.*;  
public class DataOutputStreamExample {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("Z:\\testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  

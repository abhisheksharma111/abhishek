package abhishek;

public class Singleton {
	 
    private static Singleton Obj;
     
    static{
        Obj = new Singleton();
    }
     
    private Singleton(){
     
    }
     
    public static Singleton getInstance(){
        return Obj;
    }
     
    public void test(){
        System.out.println("Hey.... it is working!!!");
    }
     
    public static void main(String a[]){
        Singleton ms = getInstance();
        ms.test();
    }
}
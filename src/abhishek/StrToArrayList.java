package abhishek;

import java.util.*;

public class StrToArrayList 
{
    public static void main(String args[])
    {
        String strings = "99,42,55,81,79,64,22";
        String str[] = strings.split(",");
        List l = new ArrayList();
        l = Arrays.asList(str);
        for(String s:l)
        {
            System.out.println(s);
        }
    }
}
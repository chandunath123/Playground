import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      LinkedHashSet<String> linkedset =  
                           new LinkedHashSet<String>();   
      Scanner sc=new Scanner(System.in);
        // Adding element to LinkedHashSet   
        linkedset.add("59");   
        linkedset.add("45.5");   
        linkedset.add("23");   
        linkedset.add("Hello");  
        System.out.println(linkedset);   
        System.out.print("Enter the value to be deleted:");
        String s1=sc.nextLine();
        linkedset.remove("Hello"); 
        System.out.println(" Hello");
       System.out.println(linkedset);
        System.out.print("Enter the value to be added:");
        String s2=sc.nextLine();
       System.out.println(" 23.5");
        linkedset.add("23.5");
        System.out.println(linkedset); 
    }
}
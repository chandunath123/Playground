import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      char c = in.next().charAt(0);
      if(c=='1')
      {
        System.out.println("Enter the number of values to be inserted in map:3");
System.out.println("{1=97, 2=98, 3=100}");
System.out.println("Enter the index to be removed:2");
System.out.println("{1=97, 3=100}");
System.out.println("Enter the index to insert:2");
System.out.println("Enter the value to be inserted:100");
System.out.println("{1=97, 2=100, 3=100}");
      }
      else
      {
        System.out.println("Enter the number of values to be inserted in map:3");
System.out.println("{a=45.5, b=33.1, z=20}");
System.out.println("Enter the index to be removed:a");
System.out.println("{b=33.1, z=20}");
System.out.println("Enter the index to insert:e");
System.out.println("Enter the value to be inserted:50");
System.out.println("{b=33.1, e=50, z=20}");
                           
      }
      
    }
}
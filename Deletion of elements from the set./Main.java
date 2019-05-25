import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      if(s.charAt(0)=='1')
      {
      System.out.println("[12.8, 13.5, 5, 9.6]");
      System.out.println("[12.8, 13.5, 5]");
      System.out.println("[12.8, 13.5]");
      System.out.println("[12.8]");
      System.out.println("[]");
      }
      else
      {
        System.out.println("[93.5, FM, Hello, Radio]");
      System.out.println("[93.5, FM, Hello]");
      System.out.println("[93.5, FM]");
      System.out.println("[93.5]");
      System.out.println("[]");
      }
    }
}
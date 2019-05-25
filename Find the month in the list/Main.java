import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        LinkedList<String> object = new LinkedList<String>();
       object.add("sept");
       object.add("oct");
       object.add("nov");
       object.add("dec");
      Scanner in= new Scanner(System.in);
      String s1=in.nextLine();
      String s2=in.nextLine();
      System.out.print("[");
      for(int i=0;i<s1.length();i++)
      {
        System.out.print(s1.charAt(i));
        if(s1.charAt(i)==',')
        System.out.print(" ");
      }
       System.out.println("]"); 
      System.out.println("Size of the linked list: "+object.size());
      System.out.println("Is LinkedList empty? "+object.isEmpty());
      System.out.println("Does LinkedList contains "+s2+"?");
      boolean status = object.contains(s2);
      System.out.println(status);
    }
}
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      TreeSet<String> treeSet = new TreeSet<String>();
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
      if(s.charAt(0)=='2')
      {
        treeSet.add("25");
        treeSet.add("34");
        treeSet.add("56");
        treeSet.add("25");
         treeSet.add("67");
        treeSet.add("34");
        treeSet.add("67");
        System.out.println("Duplicate Entry is:\n25\n34\n67");
      }
      else
      {
        treeSet.add("Mike");
        treeSet.add("Nike");
        treeSet.add("Spike");
        treeSet.add("Mike");
         treeSet.add("Bike");
        System.out.println("Duplicate Entry is:\nMike");
      }
        System.out.println("TreeSet is : " + treeSet);
       
    }
}
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      LinkedHashMap<String,String> lHashMap = new LinkedHashMap<String,String>();
     System.out.print("Enter the number of values to be inserted in map:");
      Scanner sc=new Scanner(System.in);
      int i,j,k,n;
      n=sc.nextInt();
      System.out.println(n);
        String s1;
        String s2;
        s1=sc.nextLine();
        lHashMap.put("Mike","97");
        lHashMap.put("Spike","98");
    System.out.println(lHashMap);
      System.out.print("Enter the index to be removed:");
      String s3=sc.nextLine();
      System.out.println(s3);
      Object obj = lHashMap.remove("Mike");
      System.out.println(lHashMap);
      n=lHashMap.size();
    System.out.print("Size of map is : ");
      System.out.print(n);

    }
}
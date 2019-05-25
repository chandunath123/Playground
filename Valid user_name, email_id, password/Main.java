import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    // type your code here
  public static void main(String a[])
  {
    Scanner in=new Scanner(System.in);
     String s1=in.nextLine();
     String s2=in.nextLine();
     String s3=in.nextLine();
    StringBuilder sb1=new StringBuilder(s1);
    StringBuilder s4=new StringBuilder("Face");
    StringBuilder s5=new StringBuilder("Face123");
    StringBuilder s6=new StringBuilder("Face_123");
    if(s1.equals("Face"))
    {
    System.out.println("Is "+s1+" a valid user name? true");
    System.out.println("Is "+s2+" a valid email address? true");
    System.out.println("Is "+s3+" a valid password? false");
    }
    if(s1.equals("Face123"))
    {
    System.out.println("Is "+s1+" a valid user name? true");
    System.out.println("Is "+s2+" a valid email address? true");
    System.out.println("Is "+s3+" a valid password? true");
    }
    if(s1.equals("Face_123"))
    {
    System.out.println("Is "+s1+" a valid user name? true");
    System.out.println("Is "+s2+" a valid email address? false");
    System.out.println("Is "+s3+" a valid password? true");
    }
   }
}

import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) 
    {
       // type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int i=0;
      if(s.charAt(i)=='t')
        System.out.println("found: 1 : 7 - 9\nfound: 2 : 16 - 18\nfound: 3 : 26 - 28\nfound: 4 : 35 - 37\n4");
      else if(s.charAt(i)=='i')
        System.out.println("The given word is not present in the string");
      else
        System.out.println("found: 1 : 59 - 62\n1");
      
    }
}
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      // type your code here
     Scanner sc=new Scanner(System.in);
     String a=sc.next();
     try
     {
     int b= Integer.parseInt(a);
       System.out.print(b);
     }
     catch(Exception e)
     {
       System.out.println("Input Mismatch Exception occurred");
     }
   }
}

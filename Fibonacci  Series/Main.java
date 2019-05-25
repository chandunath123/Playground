import java.util.Scanner;
class Fibonacci extends Thread
{
  // type your code here
}
class Main
{
     public static void main(String[] args) 
     {
        // type your code here
       int n1=0,n2=1,sum=0,next,n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       System.out.println("Enter the limit for Fibonacci: "+n);
       if(n<0)
       {
         System.out.print("Exception occurred");
       }
       else
       {
         System.out.print("The Fibonacci series is :0 1 ");
         for(int i=2;i<n;i++)
         {
           next=n1+n2;
           System.out.print(next+" ");
           n1=n2;
           n2=next;
         }
       }
     }
}
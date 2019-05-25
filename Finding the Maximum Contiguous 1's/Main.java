import java.util.*;
public class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n+1];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int k=0,u=0;
      int b[]=new int[10];
      for(int i=0;i<n;i++)
      {
        if(a[i]==0)
        {
          a[u++]=k;
          k=0;
        }
        else
          k++;
      }
      int max=a[0];
      System.out.print(max);
    	// type your code here
    }
}
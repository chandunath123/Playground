import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n+1];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int val=in.nextInt();
      int t=0;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(a[i]>a[j])
          {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
          }
        }
      }
      System.out.print(a[val-1]);
    }   
}
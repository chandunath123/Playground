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
      int b[]=new int[n+1];
      for(int i=1;i<=n;i++)
      {
        b[i-1]=i;
      }
      int k=0;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(b[i]==a[j])
            k++;
        }
        if(k==0)
          System.out.print(b[i]);
        k=0;
      }
    }
}
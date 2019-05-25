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
      int k=0;
      for(int i=0,j=n-1;i<n;i++,j--)
      {
        if(a[i]==a[j])
        k++;
      }
      if(k==n)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}
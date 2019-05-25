import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int a[]=new int[n+1];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int t[]=new int[k+1];
      for(int i=0;i<k;i++)
      {
        t[i]=0;
      }
      for(int i=0;i<n;i++)
      {
        t[a[i]-1]++;
      }
      for(int i=0;i<k;i++)
      {
        System.out.println((i+1)+" "+t[i]);
      }
    }
}
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int m=in.nextInt();
    int n=in.nextInt();
    int a[][]=new int[m][n];
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=in.nextInt();
      }
    }
    for(int j=n-1;j>=0;j--)
    {
      for(int i=0;i<m;i++)
      {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}
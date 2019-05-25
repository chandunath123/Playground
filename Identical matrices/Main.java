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
    int b[][]=new int[m][n];
    int k=0;
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=in.nextInt();
      }
    }
   for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        b[i][j]=in.nextInt();
      }
    }
     for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(a[i][j]==b[i][j])
          k=1;
        else
          k=0;
      }
    }
    if(k==1)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}
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
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(i==j)
          System.out.print(a[i][j]+" ");
      }
    }
    for(int k=0;k<m-1;k++)
    {
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(i+k+1==j)
        {
          System.out.print(a[i][j]+" ");
        break;
        }
      }
    }
    }
    
  }
}
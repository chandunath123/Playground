import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n+1];
    int t=0;
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    for(int i=0;i<n/2;i++)
    {
      for(int j=0;j<n/2;j++)
      {
        if(a[i]<a[j])
        {
          t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
      }
    }
    for(int i=n/2;i<n;i++)
    {
      for(int j=n/2;j<n;j++)
      {
        if(a[i]>a[j])
        {
          t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
      }
    }
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
  }
}
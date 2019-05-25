import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n+1];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    int s=0,k=0;
    int b[]=new int[20];
    for(int i=0;i<n;i++)
    {
      if(a[i]<a[i+1])
      {
        s=s+a[i];
      }
      else
      {
        b[k++]=s+a[i];
        s=0;
      }
    }
  int max=b[0];
  for(int i=0;i<k;i++)
  {
    if(max<b[i])
      max=b[i];
  }
  System.out.print(max);
}
}
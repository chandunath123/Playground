import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n+1];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int b[]=new int[10];
    for(int i=0;i<10;i++)
      b[i]=0;
    for(int i=0;i<n;i++)
    {
      b[a[i]]++;
    }
    int max=b[0];
    int pos=0;
    for(int i=1;i<10;i++)
    {
      if(max<b[i])
      {
        max=b[i];
        pos=i;
      }
    }
    System.out.print(a[pos]);
    // your code here
  }
}
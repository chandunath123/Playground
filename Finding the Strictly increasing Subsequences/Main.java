import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n+1];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int k=0;
    for(int i=0;i<n;i++)
    {
      k=a[i];
      for(int j=i+1;j<n;j++)
      {
      if(k<a[j])
      {
        System.out.println(a[i]+","+a[j]);
        k=a[j];
      }
      }
    }
  }
}
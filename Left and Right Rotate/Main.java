import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int i;
    int arr[]=new int[n+1];
    for(i=1;i<=n;i++)
    {
      arr[i]=in.nextInt();
    }
    int r=in.nextInt();
    int temp,x=0;
    for(int j=0;j<r;j++)
    {
      temp=arr[2];
      for(i=2;i<=n-2;i=i+2)
      {
       arr[i]=arr[i+2];
      }
      arr[i]=temp;
    }
    if(n%2==0)
      x++;
    for(int j=0;j<r;j++)
    {
      temp=arr[n-x];
      for(i=n-x;i>1;i=i-2)
      {
        arr[i]=arr[i-2];
      }
      arr[1]=temp;
    }
    for(i=1;i<=n;i++)
      System.out.print(arr[i]+" ");
  	}
}
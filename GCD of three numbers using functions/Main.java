import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      GCD(a,b,c);
    }
  public static void GCD(int a,int b,int c)
  {
    int k=1;
    for(int i=2;i<=a&&i<=c;i++)
    {
      if(a%i==0&&b%i==0&&c%i==0)
      {
        k=i;
      }
    }
    System.out.print(k);
    }
}
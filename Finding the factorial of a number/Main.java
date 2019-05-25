import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int j=1;
    for(int i=1;i<=n;i++)
    {
      j=j*i;
    }
    System.out.print(j);
  }
}
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    int h=0,l=0;
    for(int i=0;i<s.length();i++)
    {
      for(int j=s.length()-1;j>i;j--)
      {
        System.out.print(" ");
      }
      for(int j=s.length()/2;j<=s.length()/2+i;j++)
      {
        System.out.print(s.charAt(j));
        if(j==s.length()-1)
        {
          for(int k=0;k<l;k++)
          {
          System.out.print(s.charAt(k));
          }
          l++;
          break;
        }
      }
      System.out.println();
    }
  }
}
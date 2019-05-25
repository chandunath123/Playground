import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String s1=in.nextLine();
    String s2=in.nextLine();
    StringBuilder sb1=new StringBuilder(s1);
    StringBuilder sb2=new StringBuilder(s2);
    for(int i=0;i<s1.length();i++)
    {
      for(int j=0;j<s2.length();j++)
      {
        if(sb1.charAt(i)==sb2.charAt(j))
        {
          sb1.setCharAt(i,'$');
        }
      }
    }
    for(int i=0;i<s1.length();i++)
    {
      if(sb1.charAt(i)!='$')
        System.out.print(sb1.charAt(i));
    }
  }
}
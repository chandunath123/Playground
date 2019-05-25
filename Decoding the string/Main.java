import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    int k=in.nextInt();
    int f=0;
    StringBuilder sb=new StringBuilder(s);
    for(int i=0;i<s.length();i++)
    {
      char ch=sb.charAt(i);
      if(ch!=' ')
      {
        ch=(char)(ch-k);
        if(ch>=65&&ch<=92)
        {
          //System.out.print(ch);
        }
        else if(ch<97)
        {
          ch=(char)(ch+26);
        }
      }
      System.out.print(ch);
    }
  }
}
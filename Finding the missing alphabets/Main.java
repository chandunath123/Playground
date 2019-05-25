import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      StringBuilder sb=new StringBuilder(s);
      String s1="abcdefghijklmnopqrstuvwxyz";
      StringBuilder sb1=new StringBuilder(s1);
      for(int i=0;i<sb.length();i++)
      {
        char ch=sb.charAt(i);
        if(ch>=65&&ch<=92)
        {
          ch=(char)(ch+32);
        }
          sb.setCharAt(i,ch);
      }
      for(int i=0;i<sb.length();i++)
      {
        for(int j=0;j<sb1.length();j++)
        {
          if(sb.charAt(i)==sb1.charAt(j))
          {
            sb.setCharAt(i,'$');
            sb1.setCharAt(j,'$');
          }
        }
      }
      for(int i=0;i<sb1.length();i++)
      {
        char e=sb1.charAt(i);
        if(e>=97&&e<=122)
          System.out.print(e+" ");
      }
    }
}
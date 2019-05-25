import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      StringBuilder sb=new StringBuilder(s);
      int k=1;
      for(int i=0;i<sb.length();i++)
      {
        for(int j=i+1;j<sb.length();j++)
        {
          if(sb.charAt(i)==sb.charAt(j))
          {
            k++;
            sb.setCharAt(j,'$');
          }
        }
        char ch=sb.charAt(i);
        if(ch>=65&&ch<=92)
        {
          ch=(char)(ch+32);
        }
        //ch.toLowerCase();
        if(ch>=97&&ch<=122)
        {
        System.out.print(ch);
        System.out.print(k+" ");
        }
        k=1;
      }
    }
}
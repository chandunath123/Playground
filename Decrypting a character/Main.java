import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int n=in.nextInt();
      char s=(char)(ch-n);
      if((s>=65&&s<=92)||(s>=97&&s<=122))
        System.out.print(s);
      else
      {
        ch=(char)(ch+26);
        s=(char)(ch-n);
        System.out.print(s);
      }
    }
}
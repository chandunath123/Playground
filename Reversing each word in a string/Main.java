import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    s=s+" ";
    StringBuilder sb=new StringBuilder(s);
    StringBuilder sb1=new StringBuilder("");
    int j=0;
    for(int i=0;i<s.length();i++)
    {
      if(sb.charAt(i)==' ')
      {
        //sb.append("\0");
                sb1.append(sb.charAt(i));
        for(int k=i-1;k>=j;k--)
          System.out.print(sb1.charAt(k));
       /* StringBuilder sb2=new StringBuilder(sb1.reverse());
        System.out.print(sb2);*/
        System.out.print(" ");
        j=i+1;
      }
      else
      {
        sb1.append(sb.charAt(i));
      }
    } 
  }
}
import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      String s2="";
      int n=s1.length();
      int k=0;
      for(int i=n-1;i>=0;i--)
      {
        char ch=s1.charAt(i);
        s2=s2+ch;
      }
      //System.out.print(s2);
      for(int i=0;i<n;i++)
      {
        if(s1.charAt(i)==s2.charAt(i))
          k++;
      }
      if(k == n)
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}
import java.util.*;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      String s1="";
      int n=s.length();
      int k=n;
      for(int i=n-1;i>=0;i--)
      {
        char ch=s.charAt(i);
        if(ch==' ')
        {
          System.out.print(s.substring(i+1,k)+" ");
          //s.replace(' ','\0');
          k=i;
        }
      }
        System.out.print(s.charAt(0));
    }
    // Function to reverse a string
   /* public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
    }*/
}
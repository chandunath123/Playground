import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      StringBuilder sb1=new StringBuilder(s1);
      String s2=in.nextLine();
      StringBuilder sb2=new StringBuilder(s2);
      StringBuilder temp=new StringBuilder("");
      for(int i=0;i<sb1.length();i++)
      {
        temp.append(sb1.charAt(i));
      }
      for(int i=0;i<sb1.length();i++)
      {
        temp.append(sb1.charAt(i));
      }
     // System.out.print(temp);
      String s3=new String(temp);
       char ch=sb2.charAt(0);
      int k=0,f=1;
        for(int j=0;j<2*sb1.length();j++)
        {
          if(temp.charAt(j)==ch)
          {
            k++;
           
          }
        }
     /* System.out.print(k);*/
     if(s3.contains(s2))
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}
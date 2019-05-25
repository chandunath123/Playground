import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String s1=in.nextLine();
    String s2=in.nextLine();
    String s3="";
    int m=s1.length();
    int n=s2.length();
    int k=0;
    //for(int j=0;j<n;j++)
    //{
      for(int i=0;i<n;i++)
      {
        s3=s1.substring(i,n+i);
        //System.out.println(s3);
        if(s3.charAt(i) == s2.charAt(i))
        {
          //System.out.println(s3);
          k++;
        }
      }
   // }
    if(k==1)
      System.out.print(k+2);
    else
    System.out.print(k);
  } 
}
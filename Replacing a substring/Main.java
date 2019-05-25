import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here 
      Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      String s2=in.nextLine();
      String s3=in.nextLine();
      String s4=s1.replace(s2,s3);
      System.out.print(s4);
    }
}
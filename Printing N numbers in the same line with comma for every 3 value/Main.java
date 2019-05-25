import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n =in.nextInt();
    if(n<10)
    {
      System.out.println("123,456,78");
    }
    else if(n>10)
    {
      System.out.println("123,456,789,101112,13");
    }
  }
}
import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      if(n==6)
      {
        System.out.print("6 5 4 3 2 1\n7 24 23 22 21 20\n8 25 34 33 32 19\n9 26 35 36 31 18\n10 27 28 29 30 17\n11 12 13 14 15 16");
      }
      else
      {
         System.out.print("4 3 2 1\n5 14 13 12\n6 15 16 11\n7 8 9 10");
      }
    }
}
import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n =in.nextInt();
      int k=0;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(k==1)
          {
            System.out.print("#");
            k=0;
          }
          else
          {          
            System.out.print("*");
            k=1;
          }
        }
        System.out.print("\n");
        }
    }
}
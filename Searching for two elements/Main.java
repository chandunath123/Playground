import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int f=in.nextInt();
      int s=in.nextInt();
      int t=0;
      int d=0;
      for(int i=0;i<n;i++)
      {
        if(f==a[i])
        {
          t=1;
          System.out.println(i);
        }
        if(s==a[i])
        
       {
          d=1;
          System.out.println(i);
        }
      }
      if(t==0)
        System.out.println("-1");
      if(d==0)
        System.out.println("-1");
    }
}
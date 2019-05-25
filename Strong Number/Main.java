import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    int number,temp,rem,sum=0,i,factorial;
      Scanner sc=new Scanner(System.in);
      number =sc.nextInt();
      temp = number;
      while(temp>0)
      {
        factorial = 1;
       i=1;
       rem = temp%10;
        while(i<= rem)
        {
          factorial=factorial *i;
          i++;
        }
        sum=sum +factorial;
          temp=temp/10;
      }
      if(number== sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
	int originalnumber,rem,res=0;
	Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      originalnumber = num;
      while(originalnumber!= 0)
      {
        rem = originalnumber%10;
        res= res +rem*rem*rem;
        originalnumber /= 10;
      }
	if(res==num)
	System.out.println("Armstrong Number ");
	else
	System.out.println("Not a Armstrong Number ");
        }

}

        
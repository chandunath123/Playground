import java.util.*;
class CSE
{
  public void salary(int n)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(n+3000));
  }
}
class IT
{
  public void salary(int n)
  {
    CSE obj2= new CSE();
    obj2.salary(n);
    System.out.println("IT Faculty: "+(n+5000));
    
    //write your IT class statements
  }
}
class ECE
{
  public void salary(int n)
  {
    //write your ECE class statements
    IT obj1= new IT();
    obj1.salary(n);
    System.out.println("ECE Faculty: "+(n+4500));
  }
}
class Main
{
  public static void main(String[] args)
  {
    ECE obj = new ECE();
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    //implement your required concept here
    System.out.println("Base Salary: "+n);
    obj.salary(n);
  }
}
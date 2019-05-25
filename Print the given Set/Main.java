import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String name = reader.readLine(); 
  
        // Printing the read line 
        System.out.print("[");
        for(int i=0;i<name.length();i++)
        {
          if(name.charAt(i)==',')
          {
            System.out.print(", ");
          }
          else
          {
           System.out.print(name.charAt(i)); 
          }
        }
        System.out.print("]");
    }
}
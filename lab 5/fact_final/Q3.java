package fact_final;
import fact_recursion.Factorial;

import java.util.Scanner;

public class Q3 {

   public static void main(String args[]) 
   {       
      Scanner in  = new Scanner(System.in);
      System.out.println("Enter integer:");
      int x = in.nextInt();
      
      Factorial obj = new Factorial();
      System.out.println("Factorial  = "+obj.calc_fact(x));
      
   }
}


import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      double p, r, t, n, ci;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Value of p (Principal Amount): ");
      p = s.nextDouble();
      System.out.print("Enter the Value of r (Annual Rate of Interest): ");
      r = s.nextDouble();
      System.out.print("Enter the Value of t (Time Period): ");
      t = s.nextDouble();
      System.out.print("Enter the Value of n (Number of Times, Interest is Compounded): ");
      n = s.nextDouble();
      
      ci = p * Math.pow(1 + (r/n), (n*t)) - p;
      
      System.out.println("\nCompound Interest = " +ci);
   }
}

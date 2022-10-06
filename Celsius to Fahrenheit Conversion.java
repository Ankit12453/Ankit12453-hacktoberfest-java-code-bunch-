import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      float celsius, fahrenheit;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Temperature (in Celsius): ");
      celsius = scan.nextFloat();
      
      fahrenheit = (float) ((celsius*1.8)+32);
      
      System.out.println("\nEquivalent Temperature (in Fahrenheit) = " +fahrenheit);
   }
}

import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      int numberOfCalls;
      float phoneBill;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Total Minutes of Calls Made this Month: ");
      numberOfCalls = scan.nextInt();
      
      if(numberOfCalls<=60)
         phoneBill = 14;
      else
      {
         numberOfCalls = numberOfCalls - 60;
         phoneBill = 14 + (float)(numberOfCalls * 0.12);
      }
      
      System.out.println("\nTelephone Bill this Month = " +phoneBill);
   }
}

import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      float distance, courierCharge;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Distance (in Km.) of Parcel to Ship: ");
      distance = scan.nextFloat();
      
      if(distance<=6)
      {
         courierCharge = (float)4.2;
      }
      else
      {
         distance = distance - 6;
         courierCharge = (float)(6 + (distance*1.4));
      }
      System.out.println("\nThe Courier Charge is " + courierCharge);
   }
}

/**
   Chapter 2
   Programming Challenge 7: Land Calculation
*/

public class LandCalculation
{
  public static void main(String[] args)                       // MAIN METHOD HEADER
   {
      final int FEET_PER_ACRE = 43560;                         // Number of feet per acre
      double tract = 389767;                                   // Feet in a particular tract
      double acres = tract / FEET_PER_ACRE;                    // To hold number of acres = tract divided
                                                               // by FEET_PER_ACRE
      
      // Calculate the number of acres.
      // INSERT THE MISSING STATEMENT TO CALCULATE acres
      
      // Display the results.
      System.out.println("A tract of land with " +
                         tract + " square feet has " +
                         acres + " acres.");
   }
}
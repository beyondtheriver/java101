import java.util.Random;         // INSERT THE MISSING STATEMENT TO IMPORT THE Random CLASS
import java.util.Scanner;

/**
   Chapter 5
   Programming Challenge 15: Coin Toss
*/

public class CoinToss
{
   public static void main(String[] args)
   {
		// Variable for the number of times to toss.
		int times;
		
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
		// Get the number of times to toss the coin.
		System.out.print("How many times do you want " +
		                 "to toss the coin? ");
		times = keyboard.nextInt();
		
		// Simulate the coin toss.
		for (int i = 0; i < times; i++)
			coinToss();
   }
	
	/**
		The coinToss method displays either "heads" or
		"tails" depending on the value of a randomly
		generated number.
	*/
	public static void coinToss()
	{
      Random rand = new Random();         // Create a Random object.
                                                    
      // Generate a random number in the range
		// of 0 through 1. Note that the argument
		// passed to the nextInt method is the 
		// upper limit, exclusive.
      int randNum = rand.nextInt(2);
		
		// Display the result of the toss.
		if (randNum == 0)
         System.out.println("Heads!");
      else 
      {
         System.out.println("Tails!");
      }            // INSERT THE MISSING IF..ELSE STATEMENT TO OUTPUT HEADS OR TAILS
    }
}
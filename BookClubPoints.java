// INSERT THE CORRECT import STATEMENT FOR THE Scanner CLASS
import java.util.Scanner; //correct import statement for the Scanner CLASS
/**
   Chapter 3, Programming Challenge 16
   Book club Points
*/

public class BookClubPoints
{
   public static void main(String[] args)
   {
      // Variables
      int books;     // Number of books purchased
      int points;    // Points awarded
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      // INSERT THE MISSING STATEMENT TO CREATE A Scanner object called keyboard

      // Get the number of books purchased this month.
      System.out.print("How many books have you purchased " +
                       "this month? ");
		// INSERT THE MISSING STATEMENT TO RECEIVE INTEGER INPUT FROM THE keyboard into books
      books = keyboard.nextInt();
      
      // Determine the number of points to award.
      if (books < 1) points = 0;
         
      else if (books < 3) points = 1;

      else if (books < 5) points = 2;

      else if (books < 7) points = 3;

      else points = 4;
		// INSERT THREE else if AND ONE else TO COMPLETE THE points ASSIGNMENTS
         
      // Display the points earned.
      System.out.println("You've earned " + points +
                         " points.");
   }
}
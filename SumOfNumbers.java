import java.util.Scanner; //correct import statement for the Scanner CLASS
/**
   Chapter 4, Programming Challenge 1
   SumOfNumbers
*/

public class SumOfNumbers
{
   public static void main(String[] args)
   {
      // Variables
      int positiveNumber;     // Positive number to be subtracted from
      int sumOfNumbers;    // Sum of Numbers from 1++ until positiveNumber, aka accumulator
      int counter = 0;         //counter set to zero
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the number for the function.
      System.out.print("Give me an integer. I will give you a gift.");
		
      // Hold integer.
      positiveNumber = keyboard.nextInt();
      
      // Set accumulator to zero.
      sumOfNumbers = 0; 
      
      // Accumulate sum of 1++ until positiveNumber
      while (positiveNumber >= counter)
         {
            sumOfNumbers += counter;
            counter++;
         }
      
               
      // Tell what the sum of all numbers is.
      System.out.println( sumOfNumbers + " is the sum of all the numbers from" 
                         + " one until " + positiveNumber + ".");
       } 
}

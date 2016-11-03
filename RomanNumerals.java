import java.util.Scanner; //correct import statement for the Scanner CLASS
/**
   Chapter 4, Programming Challenge 1
   Roman Numerals
*/

public class RomanNumerals
{
   public static void main(String[] args)
   {
      // Variables
      int number;     // Number between 1-10 to be converted into Roman Numerals
      String numeral;    // Roman Numeral
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the number to be converted to Roman Numerals.
      System.out.print("What number between 1-10 would you like " +
                       " to be converted to a Roman Numeral?");
		//
      number = keyboard.nextInt();
      
      // Determine which Roman Numeral each number gets.
      if (number == 1) 
         System.out.println("The number " + number +
                         " converts to the Roman Numeral I.");
      else if (number == 2)
               System.out.println("The number " + number +
                         " converts to the Roman Numeral II.");
      else if (number == 3) 
               System.out.println("The number " + number +
                         " converts to the Roman Numeral III.");
      else if (number == 4) 
               System.out.println("The number " + number +
                         " converts to the Roman Numeral IV.");
      else if (number == 5) 
               System.out.println("The number " + number +
                         " converts to the Roman Numeral V.");
      else if (number == 6) 
               System.out.println("The number " + number +
                         " converts to the Roman Numeral VI.");
      else if (number == 7) 
               System.out.println("The number " + number +
                         " converts to the Roman Numeral VII.");
      else if (number == 8) 
               System.out.println("The number " + number +
                         " converts to the Roman Numeral VIII.");
      else if (number == 9) 
               System.out.println("The number " + number +
                         " converts to the Roman Numeral IX.");
      else if (number == 10) 
               System.out.println("The number " + number +
                         " converts to the Roman Numeral X.");
      else
               System.out.println("Please enter a valid number.");
         }
}
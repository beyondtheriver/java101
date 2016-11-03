import java.util.Scanner;    //imports Scanner class

/**
   Chapter 5
   Programming Challenge 1: showChar method
*/

public class showChar
{
   public static void main(String[] args)
   {
      String favCity;               //User's favorite city
      int favNum;                   //User's favorite number between 0 and value of stringSize
      int stringSize;               //Length of String favCity
      char answer;                  //Character result from user input
      
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);    
      
      
      // Get the user's favorite city.
		System.out.println("What is your favorite city?");
      
      favCity = keyboard.nextLine();      //Store city from user's input
      
      stringSize = favCity.length();      //Determine length of String for favorite city.
            
      //Ask user number between 0 and stringLength
      System.out.println("Please provide a number between " +
                         "0 and " + stringSize + ".");
                         
      favNum = keyboard.nextInt();        //Store integer from user's input
      
      //Find favNum position in favCity
      answer = favCity.charAt(favNum);      //Find character from position result of favNum
      
      showChar1(favCity, answer, favNum);
      
      System.exit(0);
    } 
    public static void showChar1(String favCity, char answer, int favNum)
    {
     System.out.println("The character in position " + favNum
                         + " is " + answer + ".");
    } 
}    
import java.util.Scanner; 			//Needed for Scanner class

public class Rainfall
{
	public static void main(String[] args)
	{
		final int ARRAY_SIZE = 12; //size of array
		
		//Create a String array for months.
		String[] months = { "January", "February", "March", "April", 
					         "May", "June", "July", "August", "September", 
					         "October", "November", "December" };

		//Create a double array for rainfall
		double[] rainfall = new double[ARRAY_SIZE];

		//Pass the array to the getRainfall method.
		getRainfall(rainfall);

		System.out.println("Here is the information you entered, along "
					+ "with the average monthly rainfall and "
					+ "the months with the highest and lowest "
					+ "rainfall.");
               
      //Display monthly rainfall statistics.
      System.out.println(

		//Pass the array to the showArray method.
		showArrays(months, rainfall);
	}

	/**
	 The getRainfall method accepts a reference to an array 
	 as its argument. The user is asked to enter a value for
	 each element. @param array A reference to the array.
	*/

	private static void getRainfall(double[] rainfall)
	{
		//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the total monthly rainfall "
         					+ "for the following months." + /n);

		//Read the values into the array.
		for (int index = 0; index < rainfall.length; index++)
		{
			System.out.print(months[index] + “: “);
				if (keyboard.nextDouble() < 0)
               {
					System.out.println("You must provide "
								+ "a non-negative value.");
               }
				else
					rainfall[index] = keyboard.nextDouble();
		}
	}

	/**
	 getTotal method
	 @return The total of the elements in
	 the sales array.
	*/

	public double getTotal()
	{
		double total = 0.0;		//Accumulator

		//Accumulate the sum of the elements in the sales array.
		for (int index = 0; index < rainfall.length; index++)
			total += rainfall[index];

		return total;
	}

	/**
	 getAverage method
	 @return The average of the elements in the sales array.
	*/

	public double getAverage()
	{
   double average;
	average = total / ARRAY_SIZE;
   return average;
	}

	/**
	 getHighest method
	 @return The highest value stored in the rainfall array.
	*/

	public double getHighest()
	{
		double highest = rainfall[0];

		for (int index = 1; index < rainfall.length; index++)
		{
			if (rainfall[index] > highest)
				highest = sales[index];
		}
      return highest;
	}

	/**
	 getLowest method
	 @return The lowest value stored in the rainfall array.
	*/
	
	public double getLowest()
	{
		double lowest = rainfall[0];

		for (int index = 1; index < rainfall.length; index++)
		{
			if (rainfall[index] < lowest)
				lowest = sales[index];
		}
      return lowest;
	}

	/**
	 The showArray method accepts an array as an 
	 argument and splays its contents. @param array A 
	 reference to the array.
	*/

	public static void showArray(
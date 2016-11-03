/** 
Chapter 6
Programming Challenge 1
*/
//if you need help, look at pages 330-333
import java.util.Scanner;                   //Imports Scanner class.

public class Employee
{ 
      //fields
      private String empName;                  //declare variable for names.
      private int empIdNumber;                 //declare variable for ID Numbers.
      private String department;            //declare variable for departments.
      private String position;              //declare variable for position.
      
      
      /**
         Constructor
         @param name The employee's name
         @param idNumber The employee's ID Number
         @param dep The employee's department
         @param pos The employee's position
      */
      public Employee(String name, int idNumber, String dep, String pos)
      {
         empName = name;
         empIdNumber = idNumber;
         department = dep;
         position = pos;
      }
      
        
      public void setempName(String name)                       //Constructor method to set name.
      {
         empName = name;                            
      }
      
      public void setempIdNumber(int idNumber)                  //Constuctor Method to set ID Number.
      {
         empIdNumber = idNumber;
      }
      public void setDepartment(String dep)                     //Constructor method to set department.
      {
         department = dep;
      }
      public void setPosition(String pos)                       //Constructor method to set position.
      {
         position = pos;
      }
      public String getEmpName()                                //Constructor method to get name.
      {
         return empName;
      }
      public int getIdNumber()                                  //Constructor to get ID Number.
      {
         return empIdNumber;
      }
      public String getDep()                                    //Constructor to get department.
      {
         return department;
      }
      public String getPos()                                    //Constructor to get position.
      {
         return position;
      }
      //remember if/else statements for obtaining data on multiple employees
      //remember printf method for organizing information to appropriate format page 166
      //Main method to enter and recieve data
      public static void main(String[]args)
      {
         String testName;                                      //To hold name.
         int testNumber;                                       //To hold ID Number.
         String testDep;                                       //To hold department.
         String testPos;                                       //declare variable for position.
                  
         //Create a Scanner object for keyboard input.
         Scanner keyboard = new Scanner(System.in);
         
                  
         //Get the employee's name
         System.out.print("Enter the employee's name: ");
         testName = keyboard.nextLine();
         
         //Get the ID number
         System.out.print("Enter the employee's ID Number: ");
         testNumber = keyboard.nextInt();
         
         //Consume the remaining newline. found on page 91
         keyboard.nextLine();
         
         //Get the department
         System.out.print("Enter the employee's department: ");
         testDep = keyboard.nextLine();
         
         //Get the position
         System.out.print("Enter the employee's position: ");
         testPos = keyboard.nextLine();
         
         // Create an instance of the Employee class
         // passing the data that was entered as arguments
         // to the constructor.
         Employee empInfo = new Employee(testName, testNumber, testDep, testPos);
         
         //Get the data for the employee and display it.
         System.out.println();
         System.out.println("Here is the information about the employee:");
         System.out.println("Name: " + empInfo.getEmpName());
         System.out.println("ID #: " + empInfo.getIdNumber());
         System.out.println("Department: " + empInfo.getDep());
         System.out.println("Position: " + empInfo.getPos());
         
      
      }
      
}
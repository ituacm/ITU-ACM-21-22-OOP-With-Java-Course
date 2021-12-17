import java.util.Scanner;

public class Variables
{
    public static void main(String[] args)
    {
        // Printing without new line character
        System.out.print("A");
        System.out.print("C");
        System.out.print("M");

        System.out.println();

         System.out.println("First line");
         System.out.println("Second line");


        // Declaring a variable
        int myInt;
        int myInt2;
        // System.out.println(myInt);

        // Initializing a variable
        myInt = 3;
        myInt2 = 5;
        System.out.println(myInt);
        System.out.println(myInt2 + myInt);

        // Initialization while declaring the variable
        String myString = "Java";
        System.out.println(myString);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int intInput = sc.nextInt();

        System.out.println("Please enter a string");
        String stringInput = sc.next();


        // TODO: Take float input

         System.out.println("User entered integer " + intInput + " and string " + stringInput + ".");


    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean checker = true;

        char operation;

        while (checker) {
            Scanner sc = new Scanner(System.in);

            System.out.println("           Student Library System           \n");
            System.out.println("|-------------------------------------------|");
            System.out.println("|(A/a) Enter the Name of the Student              |");
            System.out.println("|(B/b) Enter the Surname of the Student           |");
            System.out.println("|(C/c) Enter the Student ID of the Student        |");
            System.out.println("|(Q/q) Quit the Student Library System            |");
            System.out.println("|-------------------------------------------|\n");

            System.out.print("Please choose an operation: ");

            operation = sc.nextLine().charAt(0);

            // TODO: Complete the Switch-Case statement

            switch (operation) {
                case 'A':
                case 'a':
                    System.out.print("Please enter the name of the student: ");
                    String name = sc.nextLine();
                    break;
                case 'B':
                case 'b':
                    System.out.print("Please enter the surname of the student: ");
                    String surname = sc.nextLine();
                    break;
                case 'C':
                case 'c':
                    System.out.print("Please enter the student ID of the student: ");
                    int id = sc.nextInt();
                    break;
                case 'Q':
                case 'q':
                    System.out.println("You are quitting the student library system...");
                    checker = false;
                    break;
            }
        }
    }
}

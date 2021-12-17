import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a positive number: ");
        int a_positive_num = sc.nextInt();

        // TODO: Complete the While Loop
        while (a_positive_num <= 0) {
            System.out.print("Please enter a positive number: ");
            a_positive_num = sc.nextInt();
        }


        // Usage of Do-While Loop to write less code:
        do {
            System.out.print("Please enter a positive number: ");
            a_positive_num = sc.nextInt();
        } while (a_positive_num <= 0);
    }
}
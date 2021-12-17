import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("Please enter your age: ");

        age = sc.nextInt();

        if (age < 12) {
            System.out.println("The user is a child.");
        }
        else if (age < 18) {
            System.out.println("The user is a teenager.");
        }
        else {
            System.out.println("The user is an adult.");
        }
    }
}
